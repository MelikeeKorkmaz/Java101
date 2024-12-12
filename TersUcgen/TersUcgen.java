import java.util.Scanner;

// Basamak sayısı kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar ile ekrana ters üçgen çizen program

public class TersUcgen {
    public static void main(String[] args) {
        int n, i;
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısı giriniz: ");
        n = input.nextInt();

        int k = n;
        while (0 < n) {
            for (i = 1; i <= 2 * k - 1; i++) {
                System.out.print("*");
            }
            k--;
            System.out.println();
            --n;
        }
    }
}
