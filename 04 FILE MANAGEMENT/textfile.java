import java.io.*;
import java.util.*;


public class textfile {
  public static void main(String[] args) {

    File dir = new File("C:\\");
    File[] directoryListing = dir.listFiles();

    for (File file: directoryListing) {
      try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

        // READ
        List<String> content = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
          content.add(line);
        }

        // UPDATE
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        for (int i = 0; i < content.size(); i++) {
          content.set(i, content.get(i).replace("WORLD", "WOLOWOLOWOLO"));
          writer.write(content.get(i));
          write.newLine();
        }
        writer.close()

        // DELETE
        BufferedWriter writeDelete = new BufferedWriter(new FileWriter(file));
        content.remove(1);

        for (String text: content) {
          writeDelete.write(text);
          writeDelete.nextLine();
        }
        writeDelete.close();

        // CREATE
        String newFile = file.toString().split("[.]txt")[0] + "_new.txt";
        BufferedWriter newWriter = new BufferedWriter(new FileWriter(newFile));

        newWriter.write("Just created this file content!");
        newWriter.close();

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
