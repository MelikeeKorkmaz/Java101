//0-100 arasındaki random sayıyı 5 hak ile tahmin etme oyunu.

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, rnum, chance = 0;
        boolean wrong = false;
        int[] guess = new int[5];

        Random rand = new Random();
        rnum = rand.nextInt(100);

        while (chance != 5) {
            System.out.print("Tahmin hakkınız: " + (5 - chance) + "\n0-100 arasında bir sayı tahmin ediniz: ");
            num = input.nextInt();
            if (num == rnum) {
                System.out.println("Tebrikler! Doğru tahmin ettiniz. Sayı: " + rnum);
                break;
            } else if ((num < 0) || (num > 100)) {
                System.out.println("Girdiğiniz sayı 0 ve 100 aralığında olmalıdır.");
                if (!wrong) {
                    System.out.println("Tekrar yanlış aralıkta girmeniz durumunda hakkınızdan gidecektir!");
                    wrong = true;
                } else {
                    guess[chance] = num;
                    chance++;
                }
            } else {
                guess[chance] = num;
                chance++;
                System.out.println("Yanlış tahmin.");
            }

            System.out.println("Tahmin edilen sayılar: " + Arrays.toString(guess));
            System.out.println("-----------");
        }
        if (chance == 5) {
            System.out.println("Kaybettiniz. Sayı: " + rnum);
        }
    }
}