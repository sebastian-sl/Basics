import json
import os

# Example Data
my_dict = {
     "id": 1,
     "first_name": "Hans",
     "last_name": "Gruber",
     "age": 48,
     "nationality": "german"
}

my_dict_string = '''{
     "id": 1,
     "first_name": "Hans",
     "last_name": "Gruber",
     "age": 48,
     "nationality": "german"
}'''

# Path to create json
fp = os.path.dirname(__file__) + r"\json\data_python.json"

# Dumps: converting object -> string
json_dumps = json.dumps(my_dict)


# Loads: converting string -> object
json_loads = json.loads(my_dict_string)


# Dump: converting object -> string TO file
with open(fp, "w") as f:
    json.dump(my_dict, f, indent=4)


# Load: converting string -> object FROM file
with open(fp, "r") as f:
    json.load(f)
