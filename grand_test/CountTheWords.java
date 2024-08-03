/**
 * 5) Write a Java program to display number of words present in a given string?
Input:
 Java is is programming language
Output:
 Java = 1 , is = 2 , programming = 1 , language = 1 
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTheWords {

    public void wordCount(String str) {
        String[] words = str.split(" ");
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        wordMap.forEach((word, wordCount) -> System.out.println(word + " = " + wordCount));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String sentence = sc.nextLine();
        CountTheWords ctw = new CountTheWords();
        ctw.wordCount(sentence);
    }
}