package home_works.hw_2021_02_21.wordguess;

import java.util.Scanner;

public class WordGuessMain {
    private static final String WORD = "programeris";

    public static void main(String[] args) {
        Scanner wordScanner = new Scanner(System.in);
        int iteration = 1;
        boolean guessed = false;

        char[] symbols = WORD.toCharArray();
        char[] hiddenWord = replaceLettersToUnderscore(symbols);

        while (!guessed) {
            System.out.println("Įveskite raidę arba visa žodį");
            String stringInput = wordScanner.nextLine();

            if (stringInput.length() > 1 && stringInput.equals(WORD)) {
                guessed = true;
                congratulationsMessage();
            } else if (stringInput.length() == 1) {
                checkLetter(stringInput.toCharArray()[0], symbols, hiddenWord);
                guessed = checkIfGuessed(hiddenWord);
            }
            if (!guessed) {
                iterationMessage(iteration, hiddenWord);
                iteration++;
            }
        }
    }

    private static char[] replaceLettersToUnderscore(char[] symbols) {
        char[] underscoreArray = new char[symbols.length];

        for (int i = 0; i < symbols.length; i++) {
            underscoreArray[i] = '_';
        }
        return underscoreArray;
    }

    private static void checkLetter(char input, char[] symbols, char[] hiddenWord) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == input) {
                hiddenWord[i] = input;
            }
        }
    }

    private static boolean checkIfGuessed(char[] word) {
        for (char symbol : word) {
            if (symbol == '_') {
                return false;
            }
        }
        congratulationsMessage();
        return true;
    }

    private static void iterationMessage(int iteration, char[] hiddenWord) {
        System.out.print("Bandymas " + iteration + " : ");
        for (char symbol : hiddenWord) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    private static void congratulationsMessage() {
        System.out.println("Žodis: " + WORD + " atspėtas!");
    }
}