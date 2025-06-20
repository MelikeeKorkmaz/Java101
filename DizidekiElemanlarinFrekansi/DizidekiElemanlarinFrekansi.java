package DizidekiElemanlarinFrekansi;

public class DizidekiElemanlarinFrekansi {

    public static void repeat(int[] list, int i) {
        int l = 0;
        for (int j = 0; j < list.length; j++) {
            if (list[j] == i) {
                l++;
            }
        }
        System.out.println(i + " sayısı " + l + " kere tekrar etmektedir.");
    }

    public static boolean checkSameNumber(int[] list, int indis) {
        for (int j = 0; j < indis; j++) {
            if (list[j] == list[indis]) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int k = 0;
        int[] list1 = {10, 20, 20, 10, 10, 20, 5, 20};

        while (k < list1.length) {
            if (checkSameNumber(list1, k)) {
                repeat(list1, list1[k]);
            }
            k++;
        }
    }
}