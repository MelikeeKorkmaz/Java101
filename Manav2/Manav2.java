import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        System.out.println("Melike Manav'a Hoş Geldiniz");

        Scanner input = new Scanner(System.in);
        double armut, elma, domates, muz, patlican, toplam;

        System.out.print("Meyve ve sebzelerin kilogram fiyatları aşağıdaki gibidir: \n" +
                "\tArmut: 2,14 TL \n" +
                "\tElma: 3,67 TL \n" +
                "\tDomates: 1,11 TL \n" +
                "\tMuz: 0,95 TL \n" +
                "\tPatlıcan: 5 TL \n");

        System.out.println("Aldığınız meyvelerin kilogramlarını giriniz: ");
        System.out.println("Armut:");
        armut = input.nextDouble();
        System.out.println("Elma:");
        elma = input.nextDouble();
        System.out.println("Domates:");
        domates = input.nextDouble();
        System.out.println("Muz:");
        muz = input.nextDouble();
        System.out.println("Patlıcan:");
        patlican = input.nextDouble();

        toplam = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5);

        System.out.println("Ödemeniz gereken miktar: " + toplam);
        System.out.println("Yine bekleriz.");
    }
}