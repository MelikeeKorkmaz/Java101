//Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.

import java.util.Arrays;

public class MatrisTranspozu {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 5, 6},
                {6, 2, 9, 1},
                {4, 2, 8, 7},
        };
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        for (int[] row : transpose) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}