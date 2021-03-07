package home_works.hw_2021_02_21.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeMain {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String[][] board = emptyBoard();
        boolean userWon = false;
        boolean computerWon = false;

        System.out.println("Pasirinkite savo simbolį: X ar 0");
        String userSymbol = inputScanner.nextLine();
        validateSymbol(userSymbol);
        String computerSymbol = userSymbol.equalsIgnoreCase("x") ? "0" : "X";

        while (!computerWon && !userWon) {
            enterPosition(board, userSymbol);
            computerPosition(board, computerSymbol);

            drawBoard(board);

            computerWon = validateIfWon(board, computerSymbol);
            userWon = validateIfWon(board, userSymbol);
        }

        if (userWon) {
            System.out.println("\nJūs laimėjote!");
        } else if (computerWon) {
            System.out.println("\nKompiuteris laimėjo.");
        } else {
            System.out.println("\nLygiosios");
        }
    }

    private static void validateSymbol(String symbol) {
        switch (symbol) {
            case "X": {
                System.out.println("Pasirinkote X");
                break;
            }
            case "0": {
                System.out.println("Pasirinkote 0");
                break;
            }
            default: {
                System.out.println("Simbolis neatpažintas.");
                throw new IllegalArgumentException("Unknown symbol!");
            }
        }
    }

    private static String[][] emptyBoard() {
        return new String[][]
                {
                        {" ", " ", " "},
                        {" ", " ", " "},
                        {" ", " ", " "}
                };
    }

    private static void enterPosition(String[][] board, String symbol) {
        Scanner inputScanner = new Scanner(System.in);
        boolean badInput = true;

        while (badInput) {
            System.out.println("Įveskite poziciją (pvz.: '1;1')");
            String position = inputScanner.nextLine();

            String[] splittedInput = position.split(";");

            int column = Integer.parseInt(splittedInput[0]);
            int row = Integer.parseInt(splittedInput[1]);

            badInput = validatePosition(column, row, board);
            if (!badInput) {
                board[row - 1][column - 1] = symbol;
            }
        }
    }

    private static void computerPosition(String[][] board, String symbol) {
        boolean badInput = true;

        while (badInput) {
            int[] randomNumbers = new Random().ints(2, 1, 4).toArray();
            int column = randomNumbers[0];
            int row = randomNumbers[1];

            badInput = validatePosition(column, row, board);
            if (!badInput) {
                board[row - 1][column - 1] = symbol;
            }
        }
    }

    private static boolean validatePosition(int column, int row, String[][] board) {
        return !board[row - 1][column - 1].equals(" ")
                || board[row - 1][column - 1].equals("X")
                || board[row - 1][column - 1].equals("0");
    }

    private static void drawBoard(String[][] board) {
        System.out.printf("  %s  %d    %d    %d \n", "", 1, 2, 3);
        for (int n = 0; n < 3; n++) {
            System.out.printf("%d    ", n + 1);
            for (int m = 0; m < 3; m++) {
                if (m <= 1) {
                    System.out.printf("%s | ", board[n][m]);
                } else {
                    System.out.print(" " + board[n][m]);
                }
            }
            System.out.println();
            if (n < 2) {
                System.out.println("   -------------");
            }
        }
    }

    private static boolean validateIfWon(String[][] board, String symbol) {
        return checkIfWonByLine(board, symbol) || checkIfWonByColumn(board, symbol) || checkIfWonByDiagonals(board, symbol);
    }

    private static boolean checkIfWonByLine(String[][] board, String symbol) {
        return board[0][0].equals(symbol) && board[1][0].equals(symbol) && board[2][0].equals(symbol)
                || board[0][1].equals(symbol) && board[1][1].equals(symbol) && board[2][1].equals(symbol)
                || board[0][2].equals(symbol) && board[1][2].equals(symbol) && board[2][2].equals(symbol);
    }

    private static boolean checkIfWonByColumn(String[][] board, String symbol) {
        return board[0][0].equals(symbol) && board[0][1].equals(symbol) && board[0][2].equals(symbol)
                || board[1][0].equals(symbol) && board[1][1].equals(symbol) && board[1][2].equals(symbol)
                || board[2][0].equals(symbol) && board[2][1].equals(symbol) && board[2][2].equals(symbol);
    }

    private static boolean checkIfWonByDiagonals(String[][] board, String symbol) {
        return board[0][0].equals(symbol) && board[1][1].equals(symbol) && board[2][2].equals(symbol)
                || board[2][0].equals(symbol) && board[1][1].equals(symbol) && board[0][2].equals(symbol);
    }
}