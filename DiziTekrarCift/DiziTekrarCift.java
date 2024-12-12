//Dizide tekrar eden çift sayıları bulan program.

public class DiziTekrarCift {
    static boolean isSame(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1, 8, 2, 1, 2, 5, 5, 1, 6, 7, 8};
        int[] list2 = new int[list.length];
        int count = 0;

        for (int x = 0; x < list.length; x++) {
            for (int y = 0; y < list.length; y++) {
                if ((list[x] % 2 == 0) && (x != y) && (list[x] == list[y])) {
                    if (!isSame(list2, list[x])) {
                        list2[count++] = list[x];
                    }
                }
            }
        }

        for (int value : list2) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }
}