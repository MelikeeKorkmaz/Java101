import java.util.Scanner;

//İki sayının EBOB ve EKOK değerlerini bulan program.

public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2, i, n3;
        boolean sonuc = true;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci tamsayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci tamsayıyı giriniz: ");
        n2 = input.nextInt();

        if (n1 < n2) {
            for (i = n1; i > 0; --i) {
                if (n1 % i == 0 && n2 % i == 0) {
                    System.out.print("Sayıların EBOB'u = " + i);
                    break;
                }
            }
            i = 1;
            do {
                n3 = n2 * i;
                if (n3 % n1 == 0) {
                    System.out.println("\nSayıların EKOK'u= " + n3);
                }
                i++;
            } while (n3 % n1 != 0);
        } else {

            for (i = n2; i > 0; --i) {
                if (n1 % i == 0 && n2 % i == 0) {
                    System.out.print("Sayıların EBOB'u = " + i);
                    break;
                }
            }
            i = 1;
            do {
                n3 = n1 * i;
                if (n3 % n2 == 0) {
                    System.out.println("\nSayıların EKOK'u= " + n3);
                }
                i++;
            } while (n3 % n2 != 0);
        }
    }
}