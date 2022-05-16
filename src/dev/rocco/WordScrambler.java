package dev.rocco;
import java.util.Scanner;

public class WordScrambler {
    static Scanner input = new Scanner(System.in);
    private String[] scrambledWords;

    public WordScrambler(String[] wordArr) {
        scrambledWords = mixedWords(wordArr);
    }

    public static void main(String[] args) {
        System.out.println("Enter the first even length word.");
        String word1 = input.nextLine();
        System.out.println("Enter the second even length word.");
        String word2 = input.nextLine();

        System.out.println(recombine(word1,word2));
    }

    public static String recombine(String word1, String word2) {
        String recWord1 = "";
        String recWord2 = "";
        String newWord = "";
        if (!(word1.length() % 2 == 0)) {
            recWord1 = word1.substring(0, (word1.length() / 2) + 1);
        } else {
            recWord1 = word1.substring(0, word1.length() / 2);
        }
        if (!(word2.length() % 2 == 0)) {
            recWord2 = word2.substring((word2.length() / 2) + 1);
        } else {
            recWord2 = word2.substring(word2.length() / 2);
        }
        newWord = recWord1 + recWord2;
        return newWord;
    }

    public static String[] mixedWords(String[] strWords) {
        for (String i : strWords) {
            recombine(strWords[i],strWords[i+1]);
        }
        return words;
    }

}