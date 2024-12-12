import java.util.Scanner;

// Kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayıyı (mükemmel sayı) bulan program.

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi, i, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for (i = (sayi - 1); i > 0; i--) {
            if (sayi % i == 0) {
                total += i;
            }
        }
        if ((total == sayi) && (sayi != 1)) {
            System.out.print(sayi + " mükemmel sayıdır.");
        } else {
            System.out.print(sayi + " mükemmel sayı değildir.");
        }
    }
}