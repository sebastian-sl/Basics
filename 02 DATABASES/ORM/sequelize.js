// npm install sequelize
const {Sequelize} = require("sequelize");
const sequelize = new Sequelize(
    "postgres://user:password@localhost:5433/mytest",
    {logging: false})
const User = sequelize.define('test',
                                {
                                id: {type: Sequelize.INTEGER, primaryKey: true},
                                name: {type: Sequelize.STRING}},
                                {
                                    tableName: "test",
                                    timestamps: false
                                })

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
    console.log(e.id)              // returns one object only
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
    id: 4,
    name: "Jane"
})
