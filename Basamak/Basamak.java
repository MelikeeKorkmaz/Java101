import java.util.Scanner;

//Bir sayının, rakamlarının toplamını hesaplayan program.

public class Basamak {
    public static void main(String[] args) {
        int number, basamak = 0, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        number = input.nextInt();

        int i = number;
        while (i != 0) {
            i /= 10;
            basamak++;
        }

        i = number;
        while (i != 0) {
            total += i % 10;
            i /= 10;
        }
        System.out.print(number + " sayısının rakamlarının toplamı " + total);
    }
}