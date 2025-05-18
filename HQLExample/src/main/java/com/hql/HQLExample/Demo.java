package com.hql.HQLExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {
        try {
            String city = "New York"; // Example city
            String url = "https://jsonmock.hackerrank.com/api/food_outlets?city=" + city;
            String jsonResponse = getResponse(url);
            
            // Parse the response using Map and List
            Map<String, Object> rootMap = parseJsonToMap(jsonResponse);
            List<Map<String, Object>> data = (List<Map<String, Object>>) rootMap.get("data");

            String bestOutlet = "";
            double maxRating = 0;
            int maxVotes = 0;
            
            // Iterate through the data list
            for (Map<String, Object> outlet : data) {
                Map<String, Object> userRating = (Map<String, Object>) outlet.get("user_rating");
                double rating = (double) userRating.get("average_rating");
                int voteCount = (int) userRating.get("votes");
                
                // Find the best outlet based on rating and votes
                if (voteCount >= 100 && (rating > maxRating || (rating == maxRating && voteCount > maxVotes))) {
                    maxRating = rating;
                    maxVotes = voteCount;
                    bestOutlet = (String) outlet.get("name");
                }
            }
            
            System.out.println("Best Outlet: " + bestOutlet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Helper method to send GET request and get the response as a String
    private static String getResponse(String urlStr) throws Exception {
        HttpURLConnection conn = (HttpURLConnection) new URL(urlStr).openConnection();
        conn.setRequestMethod("GET");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        
        return response.toString();
    }

    // Helper method to parse the JSON string into a Map
    private static Map<String, Object> parseJsonToMap(String json) {
        // You can use a basic JSON parser or even write your own (for simplicity's sake)
        // But here, I will manually parse the response. In a real-world scenario, you'd 
        // likely use an actual JSON parser.
        Map<String, Object> map = new HashMap<>();
        
        // Manually parsing the JSON response (assuming the format is as expected)
        // For simplicity, this assumes the JSON format has already been validated.
        
        // Parse "data" array and convert each object in the array to a Map
        List<Map<String, Object>> dataList = new ArrayList<>();
        
        // For the sake of demonstration, let's assume the response looks like this:
        // {"data": [{"name": "Outlet1", "user_rating": {"average_rating": 4.5, "votes": 150}}, ...]}
        
        String jsonData = json.substring(json.indexOf("\"data\"") + 7, json.indexOf("]}") + 1);  // extract the data array part
        String[] outlets = jsonData.split("\\},\\{");  // Split each outlet into separate objects
        
        for (String outlet : outlets) {
            Map<String, Object> outletMap = new HashMap<>();
            String name = outlet.substring(outlet.indexOf("\"name\":\"") + 8, outlet.indexOf("\",\"user_rating\""));
            outletMap.put("name", name);
            
            // Parse user_rating
            String userRatingData = outlet.substring(outlet.indexOf("\"user_rating\":") + 14, outlet.indexOf("}}") + 1);
            Map<String, Object> userRatingMap = new HashMap<>();
            
            String avgRatingStr = userRatingData.substring(userRatingData.indexOf("\"average_rating\":") + 17, userRatingData.indexOf(",\"votes\""));
            double avgRating = Double.parseDouble(avgRatingStr);
            userRatingMap.put("average_rating", avgRating);
            
            String votesStr = userRatingData.substring(userRatingData.indexOf("\"votes\":") + 8);
            int votes = Integer.parseInt(votesStr);
            userRatingMap.put("votes", votes);
            
            outletMap.put("user_rating", userRatingMap);
            dataList.add(outletMap);
        }
        
        map.put("data", dataList);
        return map;
    }
}
