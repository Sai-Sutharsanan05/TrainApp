import java.util.LinkedList;
public class TrainApp {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println(" UC4: Maintain Ordered Bogie IDs ");
        System.out.println("====================================");
        LinkedList<String> train = new LinkedList<>();
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC Chair");
        train.add("Cargo");
        train.add("Guard");
        train.add(2, "Pantry Car");
        train.removeFirst(); // Removes Engine
        train.removeLast();  // Removes Guard
        System.out.println("\nFinal Train Consist:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
        System.out.println("\nTotal Bogies: " + train.size());
    }
}