import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        Scanner deneme = new Scanner(System.in);

        double mat, fizik, ing, tarih, turkce;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = deneme.nextDouble();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = deneme.nextDouble();

        System.out.print("İngilizce notunuzu giriniz: ");
        ing = deneme.nextDouble();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = deneme.nextDouble();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = deneme.nextDouble();

        double toplam, ortalama;

        toplam = mat + fizik + ing + tarih + turkce;
        ortalama = toplam / 5;

        System.out.println("Ortalamanız: " + ortalama);

        boolean sonuc = (ortalama >= 50);
        String kismet = sonuc ? "Geçtiniz" : "Kaldınız";

        System.out.println("Durumunuz: " + kismet);
    }
}
