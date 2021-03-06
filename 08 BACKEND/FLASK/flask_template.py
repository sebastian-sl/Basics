from flask import Flask, jsonify

app = Flask(__name__)

# return String
@app.route("/", methods=["GET"])
def main():
    return "HELLO WORLD"


# return Json Object
@app.route("/api/<id>", methods=["GET"])
def api(id):
    return jsonify({
        "id": 1,
        "name": "Example",
        "Adress": "Street 1",
        "City": "Chicago",
        "Country": "United States"
    })

if __name__ == "__main__":
    app.run(host="127.0.0.1", port=5000, debug=True)
