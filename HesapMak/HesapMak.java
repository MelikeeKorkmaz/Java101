import java.util.Scanner;

//Kullanıcın seçtiği işlemleri yapan hesap makinesi

public class HesapMak {
    static int addition(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) {
        return a / b;
    }

    static int mode(int a, int b) {
        return a % b;
    }

    static void rectangle(int a, int b) {
        int perimeter, area;
        perimeter = 2 * (a + b);
        area = a * b;
        System.out.print("Dikdörtgenin Alanı= " + area + "\nDikdörtgenin Çevresi= " + perimeter);
    }

    static int factorial(int a) {
        int result = 1;
        while (a >= 1) {
            result *= a;
            --a;
        }
        return result;
    }

    static int exponent(int a, int b) {
        int i, sonuc = 1;
        for (i = 0; i < b; i++) {
            sonuc *= a;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        int select, a = 0, b;
        Scanner input = new Scanner(System.in);

        String menu = "1-Toplama" +
                "\n2-Çıkarma" +
                "\n3-Çarpma" +
                "\n4-Bölme" +
                "\n5-Mod Alma" +
                "\n6-Dikdörtgen Alan ve Çevre Hesabı" +
                "\n7-Faktoriyel Hesabı" +
                "\n8-Üs alma";

        System.out.print(menu);

        System.out.print("\nLütfen yapmak istediğiniz işlemi seçiniz: ");
        select = input.nextInt();

        if (select == 7) {
            System.out.print("Lütfen sayıyı giriniz: ");
            a = input.nextInt();
            System.out.println("Faktoriyel İşlemi= " + factorial(a));
        } else {
            System.out.print("Lütfen ilk sayıyı giriniz: ");
            a = input.nextInt();
            System.out.print("Lütfen ikinci sayıyı giriniz: ");
            b = input.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Toplama işlemi= " + addition(a, b));
                    break;
                case 2:
                    System.out.print("Çıkarma işlemi=" + subtraction(a, b));
                    break;
                case 3:
                    System.out.print("Çarpma işlemi=" + multiply(a, b));
                    break;
                case 4:
                    System.out.print("Bölme İşlemi= " + division(a, b));
                    break;
                case 5:
                    System.out.print("Mod Alma İşlemi= " + mode(a, b));
                    break;
                case 6:
                    rectangle(a, b);
                    break;
                case 8:
                    System.out.print("Üs Alma İşlemi= " + exponent(a, b));
                    break;
                default:
                    System.out.print("Yanlış tuşlama yaptınız.");
                    break;
            }
        }
    }
}