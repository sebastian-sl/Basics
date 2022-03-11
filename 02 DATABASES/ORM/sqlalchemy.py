import sqlalchemy as db
import sqlalchemy.ext.declarative as dbd
import sqlalchemy.orm as dbo

engine = db.create_engine(f"mysql://root:root@localhost:3306/db")
Base = dbd.declarative_base()

class User(Base):
    __tablename__ = "users"
    id = db.Column("id", db.Integer)
    fname = db.Column("first_name", db.String, primary_key=True)
    lname = db.Column("last_name", db.String, nullable=True)

# After declaring all Classes (so new tables will be created - existing tables wont be overwritten)
Base.metadata.create_all(engine)

# Session
session = dbo.sessionmaker()
session.configure(bind=engine)
s = session()

# Select all
for user in s.query(User).all():
    print(user.id)

# Select with conditions
for user in s.query(User).filter(User.id > 5):
    print(user.id, user.fname)

# Creating new Instance and adding it to the db
peter = User(id=7, fname="Peter", lname="Giesel")
s.add(peter)

# Updating User
Ben = s.query(User).filter(User.fname == "Ben").one()
Ben.id = 99

# Delete User
s.query(User).filter(User.id == 22).delete()

s.commit()


# RAW SQL
engine_mysql = db.create_engine(f"mysql://root:root@localhost:3306/db")
engine_postgres = db.create_engine("postgresql://postgres:test@localhost:5433/mytest")
engine_mssql = db.create_engine("mssql+pyodbc://localhost/testdb?driver=SQL+Server+Native+Client+11.0")

engine_mysql.execute("SELECT * FROM users")
