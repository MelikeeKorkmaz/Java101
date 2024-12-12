import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        /*
        Taksimetre KM başına 2.20 TL tutmaktadır
        Minimum ödenecek tutar 20 TL'dir. 20 TL altındaki ürcretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */
        Scanner sayac = new Scanner(System.in);

        int km, baslangic = 10;
        double toplam, perKm = 2.20;

        System.out.print("Katedilen mesafeyi km cinsinden giriniz:");
        km = sayac.nextInt();

        toplam = baslangic + (km * perKm);
        toplam = (toplam < 20) ? 20 : toplam;

        System.out.print("Ücret tutarı:" + toplam);
    }
}
