# DATABASES (user,pw are generics)
import pyodbc
import mysql.connector
import psycopg2

# MySQL Con
con_mysql = mysql.connector.connect(
    host= "localhost",
    user= "root",
    password= "root",
    database= "db")

# Postgres con
con_ps = psycopg2.connect(
    host = "localhost",
    port = 5432,
    database = "test",
    user = "postgres",
    password = "test")

# MS SQL con
con_ms = pyodbc.connect(
    "Driver={SQL Server Native Client 11.0};"
    "Server=PC\MSSQL;"
    "Database=testdb;"
     "Trusted_Connection=yes;")

# MS Access con
con_ac = (
    r"DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};"
    r"DBQ=C:\test.accdb;")

# Continuing with MySQL for Basic operations (nearly all rdbms work the same from here on with cursor.execute(SQL Instructions))
cursor = con_mysql.cursor()

# Creating DB
cursor.execute("CREATE DATABASE IF NOT EXISTS mydatabase")
cursor.execute("USE mydatabase")

# Creating Table
cursor.execute("""CREATE TABLE IF NOT EXISTS customers
                (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), age INT)""")

# Insert Data
cursor.execute("""INSERT INTO customers
                (name, age)
                VALUES (%s, %s)""", ("Peter", 36))       # Inserts a single value (%s to escape direct input!)

val = [
    ("Dieter", 44),
    ("Julia", 27)
]

cursor.executemany("""INSERT INTO customers
                (id, name, age)
                VALUES (0, %s, %s)""", val)                # Inserts a multiple records (see executemany!)


# Read data
cursor.execute("SELECT * FROM customers")               # gets first record from cursor (reset necessary cause fetchall)
print(cursor.fetchone())
cursor.reset()

cursor.execute("SELECT * FROM customers")              # collects n records in array of tuples (size n as argument)
print(cursor.fetchmany(2))
cursor.reset()

cursor.execute("SELECT * FROM customers")              # collects every record in an array of tuples
print(cursor.fetchall())
cursor.reset()

cursor.execute("SELECT * FROM customers")              # iterates over every record in the cursor
for row in cursor:
    print(row)
cursor.reset()

# Commit (otherwise everything above won't be written into Database)
con_mysql.commit()
