import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void run() {
        //Tic Tac Toe Board
        char[][] board = new char[3][3];

        //Fill the Board With Empty
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], '-');
        }
        //Get Player Names
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Tic-Tac-Toe");
        System.out.print("Player 1's Name: ");
        String player1 = in.nextLine();
        System.out.print("Players 2's Name: ");
        String player2 = in.nextLine();

        System.out.println("Welcome to the game " + player1 + " and " + player2 + "!");

        boolean player1Turn = true;
        boolean gameEnded = false;

        while (!gameEnded) {
            drawBoard(board);

            char c;
            if (player1Turn) {
                System.out.println("It is " + player1 + "'s Turn! (X)");
                c = 'X';
            } else {
                System.out.println("It is " + player2 + "'s Turn! (O)");
                c = 'O';
            }

            int row;
            int col;

            while (true) {
                System.out.print("Please enter the row (1-3): ");
                row = in.nextInt() - 1;
                System.out.print("Please enter the column (1-3): ");
                col = in.nextInt() - 1;

                if ((row < 0) || (row > 2) || (col < 0) || (col > 2)) {
                    System.out.println("Please enter a valid range! Try again!");
                } else if (board[row][col] != '-') {
                    System.out.println("User has chosen this selection already!");
                } else {
                    break;
                }
            }

            board[row][col] = c;

            char hasWon = playerHasWon(board);
            if (hasWon == 'X') {
                String greenColor = "\u001B[32m";
                String resetColor = "\u001B[0m";
                System.out.println();
                System.out.println(greenColor + "Congrats Player 1! You Have Won!" + resetColor);
                drawBoard(board);
                gameEnded = true;
            } else if (hasWon == 'O') {
                String greenColor = "\u001B[32m";
                String resetColor = "\u001B[0m";
                System.out.println();
                System.out.println(greenColor + "Congrats Player 2! You Have Won!" + resetColor);
                drawBoard(board);
                gameEnded = true;
            } else {
                if (boardisFull(board)) {
                    System.out.println();
                    System.out.println("Tie Game");
                    drawBoard(board);
                    gameEnded = true;
                } else {
                    player1Turn = !player1Turn;
                }
            }
        }
    }

    public static void drawBoard(char[][] arr) {
        String redColor = "\u001B[31m";
        String resetColor = "\u001B[0m";
        System.out.println(redColor + "------" + resetColor);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(redColor + "------" + resetColor);
    }

    public static char playerHasWon(char[][] arr) {

        //row check
        for (int i = 0; i < 3; i++) {
            if ((arr[i][0] == arr[i][1]) && (arr[i][1] == arr[i][2]) && (arr[i][0] != '-')) {
                return arr[i][0];
            }
        }

        //column check
        for (int j = 0; j < 3; j++) {
            if ((arr[0][j] == arr[1][j]) && (arr[1][j] == arr[2][j]) && (arr[0][j] != '-')) {
                return arr[0][j];
            }
        }

        //main diagonal check
        if ((arr[0][0] == arr[1][1]) && (arr[1][1] == arr[2][2]) && (arr[0][0] != '-')) {
            return arr[0][0];
        }

        //secondary diagonal check
        if ((arr[0][2] == arr[1][1]) && (arr[1][1] == arr[2][0]) && (arr[0][2] != '-')) {
            return arr[0][2];
        }

        return '-';
    }

    public static boolean boardisFull(char[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

}