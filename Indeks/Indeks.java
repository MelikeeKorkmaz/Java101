import java.util.Scanner;

public class Indeks {
    public static void main(String[] args) {

        Scanner deger = new Scanner(System.in);

        int kilo;
        double boy, indeks;

        System.out.print("Lütfen kg cinsinden kilonuzu giriniz:");
        kilo = deger.nextInt();
        System.out.print("Lütfen m cinsinden boyunuzu giriniz:");
        boy = deger.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.println("Boyunuz:" + boy);
        System.out.println("Kilonuz:" + kilo);
        System.out.print("Vücut Kitle İndeksiniz:" + indeks);
    }
}