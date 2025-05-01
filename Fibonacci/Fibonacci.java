import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int baseNum = 0, secNum = 1, counter = 2, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Type how many numbers you want to see from the Fibonacci sequence: ");
        int count = input.nextInt();

        System.out.print(total + " " + secNum + " ");
        while (counter < count) {
            total = baseNum + secNum;
            baseNum = secNum;
            secNum = total;
            System.out.print(total + " ");
            counter++;
        }
    }
}

