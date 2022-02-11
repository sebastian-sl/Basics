import sqlalchemy as db
import sqlalchemy.ext.declarative as dbd
import sqlalchemy.orm as dbo

# Connection string as in normal db connection (here ms access)
con_str = (
    r"DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};"
    r"DBQ=C:testdb.accdb;"
    )

# Creating engine and declarative base
engine = db.create_engine(f"access+pyodbc:///?odbc_connect={con_str}")
Base = dbd.declarative_base()

# Declaring classes which will (or are already) records in the database with instance attributes as columns
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

# After declaring classes we create metdata (tablenames above will be created if they don't exist - existing wont be overwritten)
Base.metadata.create_all(engine)

# Session
session = dbo.sessionmaker()
session.configure(bind=engine)
s = session()

# Running a basic query (select)
for user in s.query(User).all():
    print(user.alter)

names = [user.nachname for user in s.query(User).all()]
print(names)
