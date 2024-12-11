import java.util.Scanner;

public class KDVHesabi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double urunkdv, kdvli;

        System.out.println("Ürün fiyatını giriniz:");
        double fiyat = sc.nextDouble();
        System.out.println("KDV oranını giriniz:");
        double kdv = sc.nextDouble();

        urunkdv = fiyat * kdv;
        kdvli = urunkdv + fiyat;

        System.out.println("Ürünün fiyatı:" + fiyat);
        System.out.println("Ürünün uygulanan KDV oranı:" + kdv);
        System.out.println("Ürünün KDV tutarı:" + urunkdv);
        System.out.print("Ürünün KDV'li fiyatı :" + kdvli);
    }
}