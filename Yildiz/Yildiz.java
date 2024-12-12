import java.util.Scanner;

// Sıra sayısı kullanıcıdan alınarak yıldızlar ile üçgen yapan program.

public class Yildiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sira, k;

        System.out.println("Sıra sayısını giriniz:");
        sira = input.nextInt();

        for (k = 1; k <= sira; k++) {
            for (int j = 0; j < (sira - k); j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (k * 2) - 1; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
