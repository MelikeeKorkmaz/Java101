import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {
        int i, limit;
        Scanner value = new Scanner(System.in);

        System.out.print("Enter limit value:");
        limit = value.nextInt();

        System.out.println("Multiples of 4 up to the entered limit number:");

        for (i = 1; i < limit; i *= 4) {
            System.out.print(i + ",");
        }

        System.out.println("\nMultiples of 5 up to the entered limit number:");

        for (i = 1; i < limit; i *= 5) {
            System.out.print(i + ",");
        }
    }
}