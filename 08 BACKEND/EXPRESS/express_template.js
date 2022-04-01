const express = require("express");

const app = express();
const server = "localhost";
const port = 8000;


// return string
app.get("/", (req, res) => {
    res.send("HELLO WORLD")
})

// return Json
app.get("/jj", (req, res) => {
    res.json({
        "id": 1,
        "name": "Example",
        "Adress": "Street 1",
        "City": "Chicago",
        "Country": "United States"
    })
})

app.listen(port, () => {
    console.log(`Express running on: ${server}:${port}`)
})
