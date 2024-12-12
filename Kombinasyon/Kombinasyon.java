import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int l, k, i, n, r, nFaktoriyel = 1, rFaktoriyel = 1, farkFaktoriyel = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Kümenizin kaç elemanı olduğunu giriniz: ");
        n = input.nextInt();
        System.out.print("Oluşacak grupların kaç elemanlı olacağını giriniz: ");
        r = input.nextInt();

        for (i = 1; i <= n; i++) {
            nFaktoriyel *= i;
        }
        for (k = 1; k <= r; k++) {
            rFaktoriyel *= k;
        }
        int j = n - r;
        for (l = 1; l <= j; l++) {
            farkFaktoriyel *= l;
        }

        double sonuc = nFaktoriyel / (rFaktoriyel * farkFaktoriyel);
        System.out.print(n + " elemanlı kümenin " + r + " elemanlı gruplarının sayısı :" + sonuc);
    }
}