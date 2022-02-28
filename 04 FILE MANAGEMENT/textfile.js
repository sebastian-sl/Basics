const folder = "C:\\"
const fs = require("fs").promises;

const main = async () => {
    const files = await fs.readdir(folder);                     // gets all files from directory

    for (file of files) {
        let filePath = folder + file;                           // iterates over all files in directory

        // READ
        let content = await fs.readFile(filePath, "utf8")

        // UPDATE
        content = content.replace("WORLD", "WOLOWOLOWOLO")

        // DELETE
        var newContent = content.split("\n")                       // Splitting lines
        newContent.splice(2, 1)                                    // Deleting 2nd row

        // // CREATE
        var outputPath = filePath.split(".txt")[0] + "_new.txt"
        await fs.writeFile(outputPath, newContent, "utf-8")
    }
}

main()
