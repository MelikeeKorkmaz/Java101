import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Havanın Kaç Santigrat derece olduğunu giriniz:");
        int degree = input.nextInt();

        if (degree <= 5) {
            System.out.print("Hava kayak yapmak için çok uygun.");
        } else if (5 < degree && degree <= 15) {
            System.out.print("Hava sinemaya gitmek için çok uygun.");
        } else if (15 < degree && degree <= 25) {
            System.out.print("Hava piknik yapmaya gitmek için çok uygun.");
        } else if (25 < degree) {
            System.out.print("Hava yüzmek için çok uygun.");
        }
    }
}