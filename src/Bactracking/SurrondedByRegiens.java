package Bactracking;
import java.util.Arrays;


// brute force method
public class SurrondedByRegiens {

    public static void main(String[] args) {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        int rows = board.length;
        int cols = board[0].length;

        char[][] visited = new char[board.length][board[0].length];
        for (int i = 0; i < visited.length; i++) {
            Arrays.fill(visited[i], '0');
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1) {
                    if (board[i][j] == 'O') {
                        backtrack(i, j, board, visited, '1');
                    }
                }
            }
        }

        // Convert unvisited O's to X and restore visited 1s to O
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O' && visited[i][j] != '1') {
                    board[i][j] = 'X';
                }
            }
        }

        // Print final board
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void backtrack(int i, int j, char[][] board, char[][] visited, char marker) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) return;
        if (board[i][j] != 'O' || visited[i][j] == marker) return;

        visited[i][j] = marker;

        backtrack(i + 1, j, board, visited, marker);
        backtrack(i - 1, j, board, visited, marker);
        backtrack(i, j + 1, board, visited, marker);
        backtrack(i, j - 1, board, visited, marker);
    }
}
