from tokenize import String
from fastapi import FastAPI
import uvicorn

app = FastAPI()


# return String
@app.get("/")
def main():
    return "HELLO WORLD"


# return Json Object
@app.get("/{parameter}")
def json(parameter):
    return {
        "id": 1,
        "name": "Example",
        "Adress": "Street 1",
        "City": "Chicago",
        "Country": "United States",
        "Parameter": parameter
    }


if __name__ == "__main__":
    uvicorn.run(app)