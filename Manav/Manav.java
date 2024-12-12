import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kgArmut, kgElma, kgDomates, kgMuz, kgPatlican;
        double fArmut = 2.14, fElma = 3.67, fDomates = 1.11, fMuz = 0.95, fPatlican = 5;

        System.out.println("Armutun kilogramını giriniz:");
        kgArmut = input.nextDouble();
        System.out.println("Elmanın kilogramını giriniz:");
        kgElma = input.nextDouble();
        System.out.println("Domatesin kilogramını giriniz:");
        kgDomates = input.nextDouble();
        System.out.println("Muzun kilogramını giriniz:");
        kgMuz = input.nextDouble();
        System.out.println("Patlıcanın kilogramını giriniz:");
        kgPatlican = input.nextDouble();

        double toplamArmut = kgArmut * fArmut;
        double toplamElma = kgElma * fElma;
        double toplamDomates = kgDomates * fDomates;
        double toplamMuz = kgMuz * fMuz;
        double toplamPatlican = kgPatlican * fPatlican;
        double toplam = toplamArmut + toplamElma + toplamDomates + toplamMuz + toplamPatlican;

        System.out.println("Toplam armut fiyatı:" + toplamArmut);
        System.out.println("Toplam elma fiyatı:" + toplamElma);
        System.out.println("Toplam domates fiyatı:" + toplamDomates);
        System.out.println("Toplam muz fiyatı:" + toplamMuz);
        System.out.println("Toplam patlıcan fiyatı:" + toplamPatlican);
        System.out.println("Toplam fiyat tutarı:" + toplam);

        /* fArmut = 2.14 gibi tanımlamayıp direk işlemlerde yazabilirdik. Kod daha açıklayıcı veya daha kısa gözükebilirdi.
        Fiyat değişimleri kodun içerisinde aramadan en üstte kolayca yapılabilsin diye tanımlandı.
         */
    }
}
