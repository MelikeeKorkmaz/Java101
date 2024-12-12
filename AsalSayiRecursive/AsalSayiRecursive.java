import java.util.Scanner;

//Kullanıcıdan alınan sayının asal sayı olup olmadığını bulan program.

public class AsalSayiRecursive {

    static int prime(int number, int i) {
        if (number < 2) {
            return 0;
        }
        if (i == 1) {
            return 1;
        } else {
            if (number % i == 0) {
                return 0;
            } else {
                return prime(number, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        int number, i, result;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextInt();
        i = number - 1;

        result = prime(number, i);

        if (result == 1) {
            System.out.print(number + " asal sayıdır.");
        } else {
            System.out.print(number + " asal sayı değildir.");
        }
    }
}