import java.util.HashMap;
import java.util.Map;

public class Sudoku {
    public static void main(String[] args) {

    }

    public static boolean validSudoku(char[][] matrix) {
        // Row validation
        for (int i = 0; i < 9; i++) {
            Map<Character, Integer> validity = new HashMap<>();
            for (int j = 0; j < 9; j++) {
                if (matrix[i][j] != '.') {
                    if (validity.putIfAbsent(matrix[i][j], 1) != null) {
                        return false; // duplicate found
                    }
                }
            }
        }

        // Column validation
        for (int j = 0; j < 9; j++) {
            Map<Character, Integer> validity = new HashMap<>();
            for (int i = 0; i < 9; i++) {
                if (matrix[i][j] != '.') {
                    if (validity.putIfAbsent(matrix[i][j], 1) != null) {
                        return false; // duplicate found
                    }
                }
            }
        }

        // Sub-box validation
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                Map<Character, Integer> validity = new HashMap<>();
                for (int i = boxRow; i < boxRow + 3; i++) {
                    for (int j = boxCol; j < boxCol + 3; j++) {
                        if (matrix[i][j] != '.') {
                            if (validity.putIfAbsent(matrix[i][j], 1) != null) {
                                return false; // duplicate found
                            }
                        }
                    }
                }
            }
        }

        return true;
    }

}
