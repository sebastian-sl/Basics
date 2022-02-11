import sqlalchemy as db
import sqlalchemy.ext.declarative as dbd
import sqlalchemy.orm as dbo

con_str = (
    r"DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};"
    r"DBQ=C:\Users\Seb\Desktop\Software Dev\04 Data\testdb.accdb;"
    )

engine = db.create_engine(f"access+pyodbc:///?odbc_connect={con_str}")
Base = dbd.declarative_base()

class User(Base):
    __tablename__ = "Tabelle1"
    ID = db.Column("ID", db.Integer)
    fname = db.Column("vorname", db.String, primary_key=True)
    nachname = db.Column(db.String, nullable=True)
    alter = db.Column(db.Integer, nullable=True)

class Person(Base):
    __tablename__ = "Tabelle5"
    vorname = db.Column(db.String, primary_key=True)
    nachname = db.Column(db.String, nullable=True)

# After declaring all Classes (so new tables will be created - existing tables wont be overwritten)
Base.metadata.create_all(engine)

# Session
session = dbo.sessionmaker()
session.configure(bind=engine)
s = session()


# Select all
for user in s.query(User).all():
    print(user.alter)

# Select with conditions
for user in s.query(User).filter(User.alter > 15):
    print(user.alter, user.fname)

# Creating new Instance and adding it to the db
peter = User(ID=5, fname="Peter", nachname="Giesel", alter=59)
s.add(peter)

s.commit()
