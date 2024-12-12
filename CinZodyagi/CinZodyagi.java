import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int tarih;
        double mod;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen doğum tarihinizi giriniz:");
        tarih = input.nextInt();

        mod = tarih % 12;

        if (mod == 0) {
            System.out.println("Çin Zodyağı: Maymun");
        } else if (mod == 1) {
            System.out.println("Çin Zodyağı: Horoz");
        } else if (mod == 2) {
            System.out.println("Çin Zodyağı: Köpek");
        } else if (mod == 3) {
            System.out.println("Çin Zodyağı: Domuz");
        } else if (mod == 4) {
            System.out.println("Çin Zodyağı: Fare");
        } else if (mod == 5) {
            System.out.println("Çin Zodyağı: Öküz");
        } else if (mod == 6) {
            System.out.println("Çin Zodyağı: Kaplan");
        } else if (mod == 7) {
            System.out.println("Çin Zodyağı: Tavşan");
        } else if (mod == 8) {
            System.out.println("Çin Zodyağı: Ejderha");
        } else if (mod == 9) {
            System.out.println("Çin Zodyağı: Yılan");
        } else if (mod == 10) {
            System.out.println("Çin Zodyağı: At");
        } else if (mod == 11) {
            System.out.println("Çin Zodyağı: Koyun");
        }
    }
}