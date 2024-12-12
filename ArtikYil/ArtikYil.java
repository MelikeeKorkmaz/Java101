import java.util.Scanner;

//  Kullanıcının girdiği yılın artık yıl olup olmadığını bulan program.

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.print("Bir yıl giriniz: ");
        yil = input.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.print(yil + " yılı bir artık yıldır.");
                } else {
                    System.out.print(yil + " yılı bir artık yıl değildir.");
                }
            } else {
                System.out.print(yil + " yılı bir artık yıldır.");
            }
        } else {
            System.out.print(yil + " yılı bir artık yıl değildir.");
        }
    }
}