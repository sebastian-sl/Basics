from flask import Flask, jsonify, render_template

app = Flask(__name__, template_folder = "")

# return String
@app.route("/", methods=["GET"])
def main():
    return "HELLO WORLD"


# returns HTML webpage with parameter as props (can be accessed by {{}} within HTML)
@app.route("/template", methods=["GET"])
def template():
    message = "HELLO WORLD"
    return render_template("index.html", parameter = message)

# return Json Object
@app.route("/<parameter>", methods=["GET"])
def api(parameter):
    return jsonify({
        "Parameter": parameter,
        "name": "Example",
        "Adress": "Street 1",
        "City": "Chicago",
        "Country": "United States"
    })

if __name__ == "__main__":
    app.run(host="127.0.0.1", port=5000, debug=True)




from flask import Flask, jsonify, render_template

app = Flask(__name__, template_folder="..\\html")

@app.route("/", methods=["GET"])
def main():
    return render_template("off.html", message="This is coming from Jinja2!", message_two="KANYE FOR PRESIDENT")



if __name__ == "__main__":
    app.run(host="127.0.0.1", port=5000, debug=True)