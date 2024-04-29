package midterm.ekaterine_kapanadze_3.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Create a set to store all different words
        Set<String> wordSet = new HashSet<>(fantasyFormatData);

        // Print the set of different words to the console
        System.out.println("Set of Different Words:");
        System.out.println(wordSet);

        // Create a map to store word lengths and their counts
        Map<Integer, Integer> wordLengthCountMap = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthCountMap.put(length, wordLengthCountMap.getOrDefault(length, 0) + 1);
        }

        // Print the word length count map to the console
        System.out.println("\nWord Length Count Map:");
        System.out.println(wordLengthCountMap);

        // Write the results to a text file "task4.txt"
        try (FileWriter writer = new FileWriter("task4.txt", true)) {
            writer.write("\n\nSet of Different Words:\n");
            writer.write(wordSet.toString());

            writer.write("\n\nWord Length Count Map:\n");
            writer.write(wordLengthCountMap.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

