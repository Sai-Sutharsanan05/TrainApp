import java.util.HashSet;
import java.util.Set;

public class TrainApp{

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC3: Track Unique Bogie IDs ");
        System.out.println("====================================");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values
        Set<String> bogies = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        // add() inserts bogie IDs into the set
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored automatically)
        bogies.add("BG101"); // Duplicate entry
        bogies.add("BG102"); // Duplicate entry

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs in Train Consist:");
        for (String bogie : bogies) {
            System.out.println(bogie);
        }

        System.out.println("\nTotal Unique Bogies: " + bogies.size());
    }
}