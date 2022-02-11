// MySQL (npm install mysql)
var mysql = require("mysql");

var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "root",
    database: "db"
})

con.connect()

con.query("SELECT * FROM users", (err, res, fields) => {        // query takes SQL Query as String and Callback function as arg (here arrow)
    res.forEach(record => {                                     // mysql returns an array of objects
        console.log(record, record["id"], record.id)            // specific columns can be accessed with []
    })
})

con.commit()                                                    // saving all changes
con.end()                                                       // end connection(!)


// Postgres (npm install pg)
var pg = require("pg")

var con_ps = new pg.Pool({
    host: "localhost",
    user: "postgres",
    password: "password",
    port: 5432,
    database: "test"
})

con_ps.query("SELECT * FROM mytest", (err, res) => {
    res["rows"].forEach(record => {                     // Postgres returns an object. The records are stored in the "rows" attribute as an array of objects
        console.log(record, record["id"], record.id)    // specific columns can be accessed with []
    })
})

con_ps.end()                                           // end connection(!)


// MS SQL (npm install mssql + npm install msnodesqlv8)
var ms = require("mssql/msnodesqlv8");

var con_ms = new ms.ConnectionPool({
    database: "testdb",
    server: "localhost",
    options: {
        trustedConnection: true                                     // using windows auth here
    }
})

con_ms.connect(() => {                                              // haven't found a way to 'hold' the connection open like in mysql/ps
    con_ms.request().query("SELECT * FROM test", (err, res) => {
        console.log(res["recordset"])                               // returns an object where records are stored in recordset as an array of objects
        console.log(res["recordset"][0]["name"])                    // specific columns can be accessed with []

        con_ms.close()                                              // end connection(!)
    })
})
