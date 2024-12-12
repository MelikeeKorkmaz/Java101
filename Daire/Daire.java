import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cevre, alan, pi = 3.14;

        System.out.print("Yarıçap değerini giriniz:");
        double r = sc.nextDouble();

        cevre = 2 * r * pi;
        alan = pi * r * r;

        System.out.println("Dairenin yarıçapı:" + r);
        System.out.println("Dairenin çevresi:" + cevre);
        System.out.println("Dairenin alanı:" + alan);
    }
}
