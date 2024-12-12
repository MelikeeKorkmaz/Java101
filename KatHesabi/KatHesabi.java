import java.util.Scanner;

/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */

public class KatHesabi {
    public static void main(String[] args) {
        int i, toplam = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Lüfen bir sayı giriniz:");
            i = input.nextInt();
            if (i % 4 == 0) {
                System.out.println(i);
                toplam += i;
                System.out.println("Girilen sayılardan 4'e bölünebilenlerin toplamı:" + toplam);
            }
        } while (i % 2 == 0);
    }
}

