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

# ITERATE
for key in employee1.keys():					# Iterate over the key only
	print(key)

for value in employee1.values():				# Iterate over the values only
	print(value)

for key in employee1:						# Iterate over the entries
	print(key, employee1[key])

for key, value in employee1.items():				# Iterate by Element for key & value, more convenient
	print(key, value)

# DELETE
employee1.pop("age")						# removes Item by Key
employee2.clear()						# clears the whole dictionary