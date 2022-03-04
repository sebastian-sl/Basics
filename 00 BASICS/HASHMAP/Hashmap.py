# INITIALIZATION		
employee1 = {							
	"id": 1,
	"name": "Peter",
	"age": 39
}

# READ
print(employee1)					# complete dictionary
print(employee1["name"])				# value by given key

# CREATE
employee1["gender"] = "m"				# new key value pair (if key doesn't exist)

# UPDATE
employee1["name"] = "Dieter"					

# ITERATE over keys
for key in employee1.keys():					
	print(key)

# ITERATE over values
for value in employee1.values():				
	print(value)

# ITERATE over elements
for key, value in employee1.items():			# Iterate by Element for key & value, more convenient
	print(key, value)

# DELETE
employee1.pop("age")					# removes Item by Key
employee2.clear()					# clears the whole dictionary
