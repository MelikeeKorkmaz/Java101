import java.util.Scanner;

//Kullanıcının girdiği sayılardan en büyük ve en küçük olanı bulan program.

public class EnBuyukEnKucuk {
    public static void main(String[] args) {
        int count, biggest, smallest, i, j, number;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayı girişi yapmak istediğinizi belirtiniz: ");
        count = input.nextInt();

        System.out.print("1. Sayıyı giriniz");
        i = input.nextInt();
        biggest = i;
        smallest = i;

        for (number = 2; number <= count; number++) {
            System.out.print(number + ". sayıyı giriniz: ");
            j = input.nextInt();

            if (j > biggest) {
                biggest = j;
            }
            if (j < smallest) {
                smallest = j;
            }
        }
        System.out.println("Girilen sayılardan en büyüğü: " + biggest);
        System.out.print("Girilen sayılardan en küçüğü: " + smallest);
    }
}