const express = require("express");
const Sequelize = require("sequelize")

// Express config
const app = express();
const server = "localhost";
const port = 8000;

// Sequlize Model
const sequelize = new Sequelize("postgres://postgres:postgres@localhost:5433/mytest", {logging: false})

const User = sequelize.define("test",
                        {
                            id: {type: Sequelize.INTEGER, primaryKey: true},
                            name: {type: Sequelize.STRING}
                        },
                        {
                            tableName: "test",
                            timestamps: false
                        }
)

// return all
app.get("/", async (req, res) => {
    let users = await User.findAll()

    res.send(users)
})

// return by Id
app.get("/get/:id", async (req, res) => {
    let user = await User.findOne({
        where: {id: req.params.id}
    })

    if (user) {
        res.send(user)
    }
    else {
        res.send(`Error! No user found with given id ${req.params.id}`)
    }
})


// Create User with id and name
app.post("/create/:id/:name", async (req, res) => {
    try {
        await User.create({
            id: req.params.id,
            name: req.params.name
        })

        res.send(`Following User created: ${req.params.id}, ${req.params.name}`)
    } catch (err) {
        res.send(`Error occured, user with that id ${req.params.id} already exists!`)
    }
})


// Update by Id (shortening this because we have no frontend form yet)
app.put("/update/:id/:name", async (req, res) => {
    try {
        await User.update(
            {name: req.params.name},
            {where: {
                id: req.params.id
            }})

        res.send(`Changed Username for id ${req.params.id} to ${req.params.name}`)

    } catch (e) {
        res.send(`Error occured, user with that id ${req.params.id} doesn't exist`)
    }
})


// Delete by Id
app.post("/del/:id", async (req, res) => {
    try {
        await User.destroy({
            where: {
                id: req.params.id
            }
        })

        res.send(`User with id ${req.params.id} deleted from database`)

    } catch (e) {
        res.send(`Error occured, user with that id ${req.params.id} doesn't exist`)
    }
})


app.listen(port, () => {
    console.log(`Express running on: ${server}:${port}`)
})
