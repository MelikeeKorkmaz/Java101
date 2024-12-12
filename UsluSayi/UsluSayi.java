import java.util.Scanner;

//Kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

public class UsluSayi {
    public static void main(String[] args) {
        int i, k, l, toplam = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        i = input.nextInt();
        System.out.print("Sayının üssünü giriniz: ");
        k = input.nextInt();

        for (l = 1; l <= k; ++l) {
            toplam *= i;
        }
        System.out.print(i + "^" + k + " = " + toplam);
    }
}