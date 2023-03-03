package interviews.avenue_code.coding_challenge_hackerrank.questions;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Section2Question2 {
    /*
     * Complete the 'bestInGenre' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING genre as parameter.
     *
     * Base URL: https://jsonmock.hackerrank.com/api/tvseries?page=
     */

    public static String bestInGenre(String genre) {
        String url = "https://jsonmock.hackerrank.com/api/tvseries?page=";
        int page = 1;
        boolean hasMorePages = true;
        List<TVSeries> tvSeriesList = new ArrayList<>();

        while (hasMorePages) {
            String currentPageUrl = url + page;
            try {
                URL requestUrl = new URL(currentPageUrl);
                HttpURLConnection connection = (HttpURLConnection) requestUrl.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();

                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    InputStream inputStream = connection.getInputStream();
                    InputStreamReader reader = new InputStreamReader(inputStream);
                    Gson gson = new Gson();
                    JsonObject responseJson = gson.fromJson(reader, JsonObject.class);
                    int totalPages = responseJson.get("total_pages").getAsInt();
                    if (page == totalPages) {
                        hasMorePages = false;
                    }
                    JsonArray data = responseJson.getAsJsonArray("data");
                    for (JsonElement element : data) {
                        JsonObject tvSeriesJson = element.getAsJsonObject();
                        if (tvSeriesJson.get("genre").getAsString().contains(genre)) {
                            TVSeries tvSeries = new TVSeries();
                            tvSeries.setName(tvSeriesJson.get("name").getAsString());
                            tvSeries.setImdbRating(tvSeriesJson.get("imdb_rating").getAsDouble());
                            tvSeriesList.add(tvSeries);
                        }
                    }
                }
                connection.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
            page++;
        }

        if (tvSeriesList.isEmpty()) {
            return "";
        }

        Collections.sort(tvSeriesList, new Comparator<TVSeries>() {
            @Override
            public int compare(TVSeries o1, TVSeries o2) {
                if (o1.getImdbRating() == o2.getImdbRating()) {
                    return o1.getName().compareTo(o2.getName());
                }
                return Double.compare(o2.getImdbRating(), o1.getImdbRating());
            }
        });

        return tvSeriesList.get(0).getName();
    }

    static class TVSeries {
        private String name;
        private double imdbRating;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getImdbRating() {
            return imdbRating;
        }

        public void setImdbRating(double imdbRating) {
            this.imdbRating = imdbRating;
        }
    }
}
