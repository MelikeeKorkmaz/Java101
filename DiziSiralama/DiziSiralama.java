//Dizinin boyutu ve dizinin elemanlarının kullanıcıdan alındığı dizideki elemanları küçükten büyüğe sıralayan program.

import java.util.Scanner;
import java.util.Arrays;

public class DiziSiralama {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını giriniz: ");
        n = input.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Dizinin elemanlarını giriniz: ");
            int j = input.nextInt();
            list[i] = j;
        }
        Arrays.sort(list);
        System.out.print(Arrays.toString(list));
    }
}