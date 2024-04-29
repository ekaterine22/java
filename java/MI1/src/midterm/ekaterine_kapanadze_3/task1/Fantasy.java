package midterm.ekaterine_kapanadze_3.task1;

import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    private String ekaterine; // Changed from "studentName" to "ekaterine"

    public Fantasy(String ekaterine) {
        this.ekaterine = ekaterine;
    }

    @Override
    public String getMoney1() {
        // Implement this method
        return "Some money";
    }

    @Override
    public String getMarket2() {
        // Implement this method
        return "Some market";
    }

    @Override
    public String methodTrumpet3(String argQuick5) {
        // Implement this method
        return "Trumpet: " + argQuick5;
    }

    @Override
    public List<String> methodBackpack4(String argProfit6) {
        // Implement this method
        List<String> backpackItems = List.of("Item 1", "Item 2", argProfit6);
        return backpackItems;
    }

    public String toString() {
        return "Fantasy [ekaterine=" + ekaterine + "]"; // Updated to use "ekaterine" instead of "studentName"
    }

    public static void main(String[] args) {
        Fantasy fantasy = new Fantasy("Ekaterine"); // Updated to use "Ekaterine" as the argument
        System.out.println(fantasy.getMoney1());
        System.out.println(fantasy.getMarket2());
        System.out.println(fantasy.methodTrumpet3("Sound"));
        System.out.println(fantasy.methodBackpack4("Profit"));
        System.out.println(fantasy);
    }
}

