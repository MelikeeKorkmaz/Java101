import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int a, b, c;

        System.out.print("İlk sayıyı giriniz:");
        a = giris.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        b = giris.nextInt();
        System.out.print("Üçüncü sayıyı giriniz:");
        c = giris.nextInt();

        if (a < b && a < c) {
            System.out.println("Küçük sayı:" + a);
            if (c < b) {
                System.out.println("Ortanca sayı:" + c);
                System.out.print("Büyük sayı:" + b);

            } else {
                System.out.println("Ortanca sayı:" + b);
                System.out.print("Büyük sayı:" + c);
            }
        } else if (b < a && b < c) {
            System.out.println("En küçük sayı:" + b);
            if (c < a) {
                System.out.println("Ortanca sayı:" + c);
                System.out.print("Büyük sayı:" + a);
            } else {
                System.out.println("Ortanca sayı:" + a);
                System.out.print("Büyük sayı:" + c);
            }
        } else if (c < a && c < b) {
            System.out.println("En küçük sayı:" + c);
            if (b < a) {
                System.out.println("Ortanca sayı:" + b);
                System.out.print("Büyük sayı:" + a);
            } else {
                System.out.println("Ortanca sayı:" + a);
                System.out.print("Büyük sayı:" + b);
            }
        }
    }
}