package interviews.avenue_code.coding_challenge_hackerrank.questions;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class Section2Question1 {

    private static final String API_URL = "https://jsonmock.hackerrank.com/api/universities?page=";

    private static String buildUrl(int pageNum) {
        return API_URL + pageNum;
    }

    /*
     * Complete the 'bestUniversityByCountry' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING country as parameter.
     * Base URL: https://jsonmock.hackerrank.com/api/universities?page=
     */

    public static String bestUniversityByCountry(String country) {
        int pageNum = 1;
        int totalPages = 1;
        String university = "";

        while (pageNum <= totalPages && university.isEmpty()) {
            try {
                URL url = new URL(buildUrl(pageNum));
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);

                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader reader = new BufferedReader(
                            new InputStreamReader(connection.getInputStream()));
                    String line;
                    StringBuilder response = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    reader.close();

                    Gson gson = new Gson();
                    JsonObject jsonResponse = gson.fromJson(response.toString(), JsonObject.class);
                    totalPages = jsonResponse.get("total_pages").getAsInt();

                    JsonArray universities = jsonResponse.get("data").getAsJsonArray();
                    for (JsonElement element : universities) {
                        JsonObject universityObj = element.getAsJsonObject();
                        String currentCountry = universityObj.getAsJsonObject("location")
                                .get("country").getAsString();
                        if (currentCountry.equalsIgnoreCase(country)) {
                            int currentRank = Integer.parseInt(
                                    universityObj.get("rank_display").getAsString().replaceAll("[^\\d]", ""));
                            String intString = university.replaceAll("[^\\d]", "");
                            //To handle NumberFormatException
                            intString = intString.isEmpty() ? "0" : intString;
                            if (university.isEmpty() || currentRank < Integer.parseInt(intString)) {
                                university = universityObj.get("university").getAsString();
                                System.out.println(university);
                            }
                        }
                    }
                } else {
                    System.out.println("Error: " + responseCode);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            pageNum++;
        }

        return university;
    }
}
