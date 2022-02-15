// npm install sequelize
const {Sequelize} = require("sequelize");

const sequelize = new Sequelize({
    host: "localhost",
    port: 5433,
    dialect: "postgres",
    username: "postgres",
    password: "runaller",
    database: "mytest",
    logging: false                                                                  // otherwise every query will be logged (and probably not executed)
})

const User = sequelize.define('test',{
                                id: {type: Sequelize.INTEGER, primaryKey: true},
                                name: {type: Sequelize.STRING}},
                                {
                                    tableName: "test",
                                    timestamps: false                               // otherwise findall will look for the columns 'createdAt' and 'updatedAt'
                                }
)

// auth/start connection
sequelize.authenticate();

// GET DATA ALL
User.findAll({
    raw: true                   // raw = true, so it returns only the result array
})
.then((e) => {
    console.log(e)              // returns an array of objects with key-value pairs
    sequelize.close()
})

// GET ONE
User.findOne({
    raw: true,
    where: {name: "Julia"}})    // where to filter
.then((e) => {
    console.log(e.id)           // returns one object only
    sequelize.close()
})

// UPDATE
User.update({ name: "Zoe" }, {
    where: {
        id: 4
    }
})

// CREATE
const jane = User.create({
    id: 5,
    name: "Jane"
})

// DELETE
User.destroy({
    where: {id: 2}
})