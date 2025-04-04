import java.util.Random;

public class MineSweeper {
    int row;
    int col;
    int baseRow;
    int baseCol;
    double mine;
    boolean isGameEnd = false;
    String[][] matrix;
    String[][] game;

    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.baseRow = row + 2;
        this.baseCol = col + 2;
        this.mine = 0;
        this.matrix = new String[this.baseRow][this.baseCol];
        this.game = new String[this.row][this.col];
    }

    void placeMine() {
        this.mine = Math.round(((this.row) * (this.col)) / 4.0);
        Random rand = new Random();
        int i = 0;
        while (i < (this.mine)) {
            int x = rand.nextInt(this.row + 1);
            int y = rand.nextInt(this.col + 1);
            if (!(matrix[x][y]).equals("*") && (x != 0) && (y != 0)) {
                this.matrix[x][y] = "*";
                i++;
            }
        }
    }

    void baseMatrix() {
        for (int i = 0; i < this.baseRow; i++) {
            for (int j = 0; j < this.baseCol; j++) {
                this.matrix[i][j] = "0";
            }
        }
        placeMine();
    }

    void frame() {
        for (int i = 0; i < this.baseRow; i++) {
            for (int j = 0; j < this.baseCol; j++) {
                if (i == 0 || (i == this.baseRow - 1)) {
                    matrix[i][j] = "_";
                } else if (j == 0 || (j == this.baseCol - 1)) {
                    matrix[i][j] = "|";
                }
            }
        }
    }

    void code(String[][] arr, int i, int j) {
        if (!((arr[i][j]).equals("*"))) {
            String str = arr[i][j];
            int number = Integer.parseInt(str);
            number++;
            arr[i][j] = Integer.toString(number);
        }
    }

    void clue() {
        baseMatrix();
        for (int i = 0; i < this.baseRow; i++) {
            for (int j = 0; j < this.baseCol; j++) {
                if ((matrix[i][j]).equals("*")) {
                    code(this.matrix, i - 1, j);
                    code(this.matrix, i - 1, j - 1);
                    code(this.matrix, i - 1, j + 1);
                    code(this.matrix, i + 1, j - 1);
                    code(this.matrix, i + 1, j);
                    code(this.matrix, i + 1, j + 1);
                    code(this.matrix, i, j - 1);
                    code(this.matrix, i, j + 1);
                }
            }
        }
        frame();
    }

    void printMatrix() {
        for (String[] i : this.matrix) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void game() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                this.game[i][j] = "-";
            }
        }
    }

    void play(int k, int l) {
        if ((this.game[k][l]).equals("-")) {
            if ((this.matrix[k + 1][l + 1]).equals("*")) {
                System.out.println("Mayın!!! Oyunu kaybettiniz.");
                isGameEnd = true;
            } else {
                this.game[k][l] = this.matrix[k + 1][l + 1];
                printGame();
                if (check()) {
                    System.out.println("Tebrikler!!! Oyunu kazandınız.");
                    isGameEnd = true;
                }
            }
        } else {
            System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin!");
        }
    }

    boolean check() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (((this.game[i][j]).equals("-")) && (!((this.matrix[i + 1][j + 1]).equals("*")))) {
                    return false;
                }
            }
        }
        return true;
    }

    void printGame() {
        for (String[] i : this.game) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}