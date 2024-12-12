import java.util.Scanner;

public class UsAl {
    static int process(int base, int exponent) {
        if (0 == exponent) {
            return 1;
        }
        return process(base, exponent - 1) * base;
    }

    public static void main(String[] args) {
        int base, exponent;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        base = input.nextInt();
        System.out.print("Sayının üssünü giriniz: ");
        exponent = input.nextInt();

        System.out.print(process(base, exponent));
    }
}