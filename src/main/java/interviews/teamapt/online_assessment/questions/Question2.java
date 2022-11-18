package interviews.teamapt.online_assessment.questions;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Question2 {
    private static final String URL =
            "https://jsonmock.hackerrank.com/api/inventory?barcode=";

    /*
    * Complete the 'getDiscountedPrice' function below.
    *
    * The function is expected to return an INTEGER.
    * The function accepts INTEGER barcode as parameter.
    * API URL: https://jsonmock.hackerrank.com/api/inventory?barcode=
    <barcode>
    */
    public static int getDiscountedPrice(int barcode) throws IOException {
        java.net.URL obj = new URL(URL + barcode);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new
                InputStreamReader(con.getInputStream()));
        String response;
        while ((response = in.readLine()) != null) {
            JsonObject jsonResponse = new Gson().fromJson(response,
                    JsonObject.class);
            JsonArray data = jsonResponse.getAsJsonArray("data");
            for (JsonElement e : data) {
                int discount = e.getAsJsonObject().get("discount").getAsInt();
                int price = e.getAsJsonObject().get("price").getAsInt();
                return Math.round(price - ((discount / 100f) * price));
            }
        }
        return -1;
    }
}
