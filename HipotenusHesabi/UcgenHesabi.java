import java.util.Scanner;

public class UcgenHesabi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Üçgenin dik kenarlardan birinin uzunluğunu giriniz:");
        int a = sc.nextInt();

        System.out.print("Diğer kenarın uzunluğunu giriniz:");
        int b = sc.nextInt();

        double d = Math.sqrt((a * a) + (b * b));

        System.out.print("Hipotenüs:" + d);
    }
}
