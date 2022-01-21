# PYTHON ARRAYS

# DECLARATION
myArray: list; myArray2: list; myArray3: list

# INITIALIZATION
myArray = ["Tim", "Julia", "Hans"]
myArray2 = [5, 8, 2]

# CREATE
myArray.insert(1, "Lola")							# Insert into specific position (here: 1)
myArray.append("Peter")								# Append to the end of the array

# READ
print(myArray)							# Prints complete Array
print(myArray[2])						# Prints the Element with Index

# UPDATE
myArray[0] = "Zoe"									# Updates Element by Index
myArray2 = list(map(lambda n: n + n, myArray2))		# Maps Function to all Elements
myArray3 = myArray + myArray2								# Joins two Arrays


# ITERATE
for i in range(len(myArray)):						# Iterate by index
	print(myArray[i])

for name in myArray:								# Iterate by Element
	print(name)

# SORT
myArray.sort()										# Sort ASC - returns iterator
myArray.sort(reverse=True)							# Sort DESC - returns iterator

myArray.reverse()									# Reverses the order of the Array

# DELETE
myArray.pop()										# Removes last Element
myArray.remove("Julia")								# Remove Element by Value
del myArray[2]										# Remove Element by Index
myArray.clear()										# Removes everything