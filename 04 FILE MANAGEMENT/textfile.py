import os

dir_path = r"C:\Files\txt"


for txt_file in os.listdir(dir_path):          # iterate over every file in the directory
    file_path = dir_path + "/" + txt_file

    with open(file_path, mode="r+", encoding="utf8", errors="ignore") as f:      # r = read, w = write, a = append, + = update

        # READ
        output = f.read()                                                       # iterates over every line and returns it
        output = f.readline().strip()                                           # same as above but need to strip new lines

        output = f.read().splitlines()                                          # returns lines in an array of strings
        output = f.readlines()                                                  # same as above but sadly with \n for newlines


        # UPDATE
        f.seek(0)                                                               # need to return to first position after reaching the end (by reading for example)
        output = f.read().replace("HELLO", "NOT HELLO")                         # case sensitive!


        # DELETE
        f.seek(0)
        output = f.read().splitlines()

        del output[2]                                                          # delete from array by index (with del) or by element (remove)


        # CREATE
        new_split = txt_file.split(".", 1)                                      # Splitting file name and extension to create new file names
        new_path = dir_path + "/" + new_split[0] + "_new." + new_split[1]


        with open(new_path, "w") as new:
            new.write("\n".join(output))                                        # \n to create new lines for each element of the array
