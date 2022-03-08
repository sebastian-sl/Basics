import java.io.*;
import com.google.gson.Gson;

// need to create a class which we can map to the json object
class Person {
    int id, age;
    String firstName, lastName, nationality;

    Person(int id, String firstName, String lastName, int age, String nationality) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
    }
}

class App {
    public static void main(String[] args) throws IOException{

        String fp = System.getProperty("user.dir") + "\\json\\json_java.json";

        // Creating an instance before
        Person person = new Person(1, "Hans", "Gruber", 48, "german");

        // Creating Json Object
        Gson gson = new Gson();
        String jsonStr = gson.toJson(person);

        // Write to File
        BufferedWriter writer = new BufferedWriter(new FileWriter(fp));

        writer.write(jsonStr);
        writer.close();

        // Read from File
        BufferedReader reader = new BufferedReader(new FileReader(fp));

        Person readPerson = gson.fromJson(reader, Person.class);
        reader.close();
    }
}
