// Dizileri kullanarak "*" ile B harfi oluşturan program.

public class DiziBHarfi {
    public static void main(String[] args) {
        String[][] matrix = new String[7][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if ((row == 0 && col != 3) || (row == 3 && col != 3) || (row == 6 && col != 3) || col == 0 || (col == 3 && row != 0 && row != 3 && row != 6)) {
                    matrix[row][col] = " * ";
                } else {
                    matrix[row][col] = "   ";
                }
            }
        }

        for (String[] row : matrix) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}