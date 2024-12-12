import java.util.Scanner;

/*
Sayının armstrong sayı olup olmadığını bulan program
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
 */

public class Armstrong {
    public static void main(String[] args) {

        int i, basamak = 0, numbers, total = 0, k;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        i = input.nextInt();

        int number = i;
        while (number != 0) {
            number /= 10;
            basamak++;
        }

        number = i;
        while (number != 0) {
            numbers = number % 10;
            System.out.println("Girilmiş olan sayılar: " + numbers);

            int multiply = 1;
            for (k = 1; k <= basamak; k++) {

                multiply *= numbers;
                System.out.println(multiply);
            }
            total += multiply;
            number /= 10;
        }
        System.out.println("Sayıların Toplamı: " + total);

        if (total == i) {
            System.out.println(i + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(i + " sayısı bir Armstrong sayı değildir.");
        }
    }
}