package Bactracking;

import java.util.ArrayList;
import java.util.List;

public class NQueensProblem {

    public static void main(String[] args) {
        int n = 4;  // You can change this to solve for different N
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        backtrack(result, board, 0, n);
        System.out.println("Total Solutions: " + result.size());
        for (List<String> solution : result) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    public static void backtrack(List<List<String>> result, char[][] board, int col, int n) {
        if (col == n) {
            saveBoard(result, board, n);
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                backtrack(result, board, col + 1, n);
                board[row][col] = '.';
            }
        }
    }

    private static void saveBoard(List<List<String>> result, char[][] board, int n) {
        List<String> str = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            str.add(new String(board[i]));
        }
        result.add(str);
    }

    private static boolean isSafe(char[][] board, int row, int col, int n) {
        // Check same row on the left
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check lower-left diagonal
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
}
