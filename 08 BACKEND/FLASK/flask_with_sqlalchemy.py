from re import search
from flask import Flask, jsonify
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)

# We take the same example from our database project
app.config["SQLALCHEMY_DATABASE_URI"] = "mysql+mysqlconnector://root:root@localhost/db"
db = SQLAlchemy(app)

# Model
class User(db.Model):
    __tablename__ = "users"

    # Desired Attribute name = real column name
    ID = db.Column("id", db.Integer, primary_key=True)
    fname = db.Column("first_name", db.String)
    lname = db.Column("last_name", db.String)

    # makes it easier to return json
    def asdict(self):
        return {"ID": self.ID, "name": self.fname, "age": self.lname}

# Model option 2 (works too but cant change the desired object attribute names!)
customer_db = SQLAlchemy(app)
customer_db.Model.metadata.reflect(customer_db.engine)

class Customer(customer_db.Model):
    __table__ = customer_db.Model.metadata.tables["customers"]

    def asdict(self):
        return {"ID": self.id, "fname": self.first_name, "lname": self.last_name}


# Entry point to return all
@app.route("/get/", methods = ["GET"])
def all():
    res = [user.asdict() for user in db.session.query(User).all()]

    return jsonify(res)


# Get by Id
@app.route("/get/<searchId>", methods=["GET"])
def filter(searchId):
    res = [user.asdict() for user in db.session.query(User).filter(User.ID == searchId)]

    return jsonify(res)

# Create
@app.route("/create/<newId>/<firstname>/<lastname>", methods = ["POST"])
def create(newId, firstname, lastname):
    user = User(ID = newId, fname = firstname, lname = lastname)

    try:
        db.session.add(user)
        db.session.commit()

        return "User added"

    except Exception as e:
        return "Error occured! User with that ID probably already exists"

# Update by Id (shortening this because we have no frontend yet)
@app.route("/update/<searchId>/<firstname>/<lastname>")
def update(searchId, firstname, lastname):
    user = db.session.query(User).filter(User.ID == searchId).one()

    try:
        user.fname = firstname
        user.lname = lastname

        db.session.commit()

        return "Updated user"

    except Exception as e:
        return "Error occured! User with that ID probably doesn't exist"


# Delete by Id
@app.route("/del/<searchId>", methods=["GET"])
def delete(searchId):
    user = db.session.query(User).filter(User.ID == searchId)

    try:
        user.delete()
        db.session.commit()

        return f"User with id {searchId} delete from Database!"

    except Exception as e:
        print(e)
        return "Error occured! User with that ID probably doesn't exist"


if __name__ == "__main__":
    app.run(host="127.0.0.1", port=5000, debug=True)
