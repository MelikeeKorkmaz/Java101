import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz:");
        double n1 = input.nextDouble();
        System.out.print("ikinci sayıyı giriniz:");
        double n2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.print("Yaptıracağınız işlemi seçip 1-2-3-4 sayılarından birini tuşlayınız: ");
        int choise = input.nextInt();

        switch (choise) {
            case 1:
                System.out.print("Toplama İşlemi:" + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma İşlemi:" + (n1 - n2));
                break;
            case 3:
                if (n2 == 0) {
                    System.out.print("Bir sayı 0'a bölünemez.");
                } else {
                    double bolme = n1 / n2;
                    System.out.print("Bölme İşlemi:" + bolme);
                }
                break;
            case 4:
                System.out.print("Çarpma İşlemi:" + (n1 * n2));
                break;
            default:
                System.out.print("yanlış tuşlama yaptınız.");
        }
    }
}