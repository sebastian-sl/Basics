const fetch = require("node-fetch");
const cheerio = require("cheerio");


// GET REQUEST (API)
const getrequest = async () => {
    var response = await fetch("https://jsonplaceholder.typicode.com/users");
    var data = await response.json();

    console.log(data)               // prints all objects

    for (user of data) {            // iterates over all objects and prints attributes
        console.log(user.name)
    }
}
getrequest()


// WEB SCRAPING (not really recommended because of multiple things like security, cookies, js. Better use an api if there is one!)
const htmlrequest = async () => {
    var response = await fetch("https://www.amazon.de/fire-hd-10-plus/dp/B08F682ZHL",
                                options = {
                                    headers: {
                                        "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"
                                    }
                                })
    var data = await response.text();

    $ = cheerio.load(data);
    var element = $('.a-offscreen').first().text()

    console.log(element)
}
htmlrequest()
