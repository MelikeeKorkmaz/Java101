import java.util.Scanner;

//Girilen sayının harmonik serisini bulan program.

public class Harmonik {
    public static void main(String[] args) {
        int i;
        double k = 1, toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        i = input.nextInt();

        do {
            toplam += 1 / k;
            k++;
        } while (k <= i);
        System.out.print("Harmonik serisi: " + toplam);
    }
}