package week5;

import java.util.Scanner;

public class LetterSpacesNumbers {
    public static void main(String[] args) {
        int countLetters = 0;
        int countSpaces = 0;
        int countNumbers = 0;
        int countOthers = 0;
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String spaces = " ";
        String numbers = "0123456789";
        String others = ".,:;!@$%?<>\"{}()/|-'=+#*&";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < letters.length(); j++) {
                if (Character.toString(input.charAt(i)).equals(Character.toString(letters.charAt(j)))) {
                    countLetters++;



                }
            }
            for (int j = 0; j < numbers.length(); j++) {
                if (Character.toString(input.charAt(i)).equals(Character.toString(numbers.charAt(j)))) {
                    countNumbers++;



                }
            }
            for (int j = 0; j < spaces.length(); j++) {
                if (Character.toString(input.charAt(i)).equals(" ")) {
                    countSpaces++;



                }

            }

            for (int j = 0; j < others.length(); j++) {
                if (Character.toString(input.charAt(i)).equals(Character.toString(others.charAt(j)))) {
                    countOthers++;
                }
            }



        }
        countSpaces++;
        System.out.println("\n letter: " + countLetters);
        System.out.println("space: " + countSpaces);
        System.out.println("number: " + countNumbers);
        System.out.println("other: " + countOthers);
    }
}

