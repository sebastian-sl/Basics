# Python doesn't have the term hashmap but since a hashmap is a data structure that
# creates key-value pairs, we can use the built-in dictionaries for the same purpose.

# INITIALIZATION		
employee1 = {							# Best Practice to indent the Code
	"id": 1,
	"name": "Peter",
	"age": 39
}

employee2 = {
	"id": 2,
	"name": "Peter",
	"age": 27
}

# CREATE
employee1["gender"] = "m"					# Create a new key value pair in a dictionary
employee2["gender"] = "f"					# by using the dict[key] = value term

# READ
print(employee1)						# Prints the whole dictionary
print(employee1["name"])					# Prints the value of the given key

# UPDATE
employee1["name"] = "Dieter"					# Update ELement by key

all_employee = {}						# Merging two dictionaries
all_employee.update(employee1)					# NOTE: Overrides values with same key!

# ITERATE
for key in employee1:						# Iterate by Key (same as dict.keys() - can access values aswell)
	print(key, employee1[key])

for key, value in employee1.items():				# Iterate by Element for key & value, more convenient
	print(key, value)

# DELETE
employee1.pop("age")						# removes Item by Key
employee1.popitem()						# removes last item in the dictionary
all_employee.clear()						# clears the whole dictionary