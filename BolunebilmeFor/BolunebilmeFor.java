import java.util.Scanner;

//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

public class BolunebilmeFor {
    public static void main(String[] args) {
        int i, a, toplam = 0, adet = 0;
        double ortalama;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir pozitif tamsayı giriniz:");
        a = inp.nextInt();

        for (i = 0; i <= a; ++i) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + ",");
                toplam += i;
                adet++;
            }
        }

        if (adet > 0) {
            ortalama = toplam / adet;
            System.out.print("\nSayıların ortalaması:" + ortalama);
        } else {
            System.out.print("Girmiş olduğunuz sayı içerisinde 3 ve 4'e bölünebilen sayı bulunmamaktadır.");
        }
    }
}