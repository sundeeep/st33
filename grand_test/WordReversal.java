/**
 * 4) Write a java program to display reverse of a word in a given string?
Input:
 This Is Java Class
Output:
 sihT sI avaJ ssalC 
 */

import java.util.Scanner;

public class WordReversal {

    public static void reverseCharacters(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
    
    public String reverseWords(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        for (int i = 0; i <= chars.length; i++) {
            if (i == chars.length || chars[i] == ' ') {
                while (start < end) {
                    char temp = chars[start];
                    chars[start] = chars[end];
                    chars[end] = temp;
                    start++;
                    end--;
                }
                start = i + 1;
            }
        }
        return new String(chars);
    }
    
    public static void main(String[] args) {
        WordReversal wr = new WordReversal();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentenece to reverse the words in that: ");
        String sentence = input.nextLine();
        String sentenceWithReversedWords = wr.reverseWords(sentence);
        System.out.println(sentenceWithReversedWords);
    }
    
}


