import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// json Library in maven/gradle/lib folder
import org.json.JSONArray;
import org.json.JSONObject;

public class App {
    public static void main(String[] args) throws Exception {

        String url = "https://jsonplaceholder.typicode.com/users";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .GET()
        .header("accept", "application/json")
        .uri(URI.create(url))
        .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        JSONArray jsonArray = new JSONArray(response.body());

        // Iterates over the jsonArray, creates jsonObject for each and then you can access its values by key
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject json = jsonArray.getJSONObject(i);
            System.out.println(json.getString("name"));
        }
    }
}
