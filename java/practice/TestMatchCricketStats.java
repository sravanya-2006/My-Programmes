package practice;

import java.util.HashMap;
import java.util.Map;

public class TestMatchCricketStats {

    public static void main(String[] args) {
        // Create a HashMap for storing countries and matches won
        Map<String, Integer> countryMatchesWon = new HashMap<>();

        // Add countries and matches won to the HashMap
        countryMatchesWon.put("England", 1020);
        countryMatchesWon.put("Australia", 1003);
        countryMatchesWon.put("India", 565);
        countryMatchesWon.put("West Indies", 490);
        countryMatchesWon.put("Pakistan", 422);

        // Print initial HashMap
        System.out.println("Initial HashMap:");
        printHashMap(countryMatchesWon);

        // Retrieve number of matches won for a specific country
        String countryToRetrieve = "India";
        if (countryMatchesWon.containsKey(countryToRetrieve)) {
            System.out.println("\nMatches won by " + countryToRetrieve + ": " + countryMatchesWon.get(countryToRetrieve));
        } else {
            System.out.println("\n" + countryToRetrieve + " not found in HashMap.");
        }

        // Remove a country if it is not eligible for Test matches
        String ineligibleCountry = "West Indies";
        if (countryMatchesWon.containsKey(ineligibleCountry)) {
            countryMatchesWon.remove(ineligibleCountry);
            System.out.println("\nRemoved " + ineligibleCountry + " from HashMap.");
        } else {
            System.out.println("\n" + ineligibleCountry + " not found in HashMap. No removal.");
        }

        // Print HashMap after removal
        System.out.println("\nHashMap after removal:");
        printHashMap(countryMatchesWon);

        // Check if a particular country exists in the HashMap
        String checkCountry = "Australia";
        if (countryMatchesWon.containsKey(checkCountry)) {
            System.out.println("\n" + checkCountry + " exists in HashMap.");
        } else {
            System.out.println("\n" + checkCountry + " does not exist in HashMap.");
        }
    }

    // Method to print the HashMap
    public static void printHashMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
