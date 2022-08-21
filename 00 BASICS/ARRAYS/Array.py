# INITIALIZATION
myArray = ["Tim", "Julia", "Hans"]

# READ
print(myArray)										# print complete Array
print(myArray[2])									# print one element of the Array (2nd index)

# CREATE
myArray.insert(1, "Lola")								# Insert into specific position
myArray.append("Peter")									# Append to the end of the array

# UPDATE
myArray[0] = "Zoe"									# Updates Value of an Element of the Array

# ITERATE BY INDEX
for i in range(len(myArray)):								
	print(myArray[i])
	
# ITERATE BY ELEMENT
for name in myArray:									
	print(name)

# SORT
myArray.sort()										# ASC, myArray.sort(reverse=True) for desc

# REVERSE
myArray.reverse()

# DELETE element
myArray.remove("Julia")									# Remove Element by Value
del myArray[2]										# Remove Element by Index

# DELETE all
myArray.clear()										# Removes everything
