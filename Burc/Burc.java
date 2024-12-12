import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz günü giriniz:");
        double gun = input.nextDouble();
        System.out.print("Doğduğunuz ayı giriniz:");
        double ay = input.nextDouble();

        if (ay == 1) {
            if (1 <= gun && gun <= 21) {
                System.out.print("Burcunuz: Oğlak");
            } else if (22 <= gun && gun <= 31) {
                System.out.print("Burcunuz: Kova");
            } else {
                System.out.print("Doğduğunuz gün 1-31 aralığında girilmelidir.");
            }

        } else if (ay == 2) {
            if (1 <= gun && gun <= 19) {
                System.out.print("Burcunuz: Kova");
            } else if (20 <= gun && gun <= 29) {
                System.out.print("Burcunuz: Balık");
            } else {
                System.out.print("Doğduğunuz gün 1-29 aralığında girilmelidir.");
            }

        } else if (ay == 3) {
            if (1 <= gun && gun <= 20) {
                System.out.print("Burcunuz: Balık");
            } else if (21 <= gun && gun <= 31) {
                System.out.print("Burcunuz: Koç");
            } else {
                System.out.print("Doğduğunuz gün 1-31 aralığında girilmelidir.");
            }

        } else if (ay == 4) {
            if (1 <= gun && gun <= 20) {
                System.out.print("Burcunuz: Koç");
            } else if (21 <= gun && gun <= 30) {
                System.out.print("Burcunuz: Boğa");
            } else {
                System.out.print("Doğduğunuz gün 1-30 aralığında girilmelidir.");
            }

        } else if (ay == 5) {
            if (1 <= gun && gun <= 21) {
                System.out.print("Burcunuz: Boğa");
            } else if (22 <= gun && gun <= 31) {
                System.out.print("Burcunuz: İkizler");
            } else {
                System.out.print("Doğduğunuz gün 1-31 aralığında girilmelidir.");
            }

        } else if (ay == 6) {
            if (1 <= gun && gun <= 22) {
                System.out.print("Burcunuz: İkizler");
            } else if (23 <= gun && gun <= 30) {
                System.out.print("Burcunuz: Yengeç");
            } else {
                System.out.print("Doğduğunuz gün 1-30 aralığında girilmelidir.");
            }

        } else if (ay == 7) {
            if (1 <= gun && gun <= 22) {
                System.out.print("Burcunuz: Yengeç");
            } else if (23 <= gun && gun <= 31) {
                System.out.print("Burcunuz: Aslan");
            } else {
                System.out.print("Doğduğunuz gün 1-31 aralığında girilmelidir.");
            }

        } else if (ay == 8) {
            if (1 <= gun && gun <= 22) {
                System.out.print("Burcunuz: Aslan");
            } else if (23 <= gun && gun <= 31) {
                System.out.print("Burcunuz: Başak");
            } else {
                System.out.print("Doğduğunuz gün 1-31 aralığında girilmelidir.");
            }

        } else if (ay == 9) {
            if (1 <= gun && gun <= 22) {
                System.out.print("Burcunuz: Başak");
            } else if (23 <= gun && gun <= 30) {
                System.out.print("Burcunuz: Terazi");
            } else {
                System.out.print("Doğduğunuz gün 1-30 aralığında girilmelidir.");
            }

        } else if (ay == 10) {
            if (1 <= gun && gun <= 22) {
                System.out.print("Burcunuz: Terazi");
            } else if (23 <= gun && gun <= 31) {
                System.out.print("Burcunuz: Akrep");
            } else {
                System.out.print("Doğduğunuz gün 1-31 aralığında girilmelidir.");
            }

        } else if (ay == 11) {
            if (1 <= gun && gun <= 21) {
                System.out.print("Burcunuz: Akrep");
            } else if (22 <= gun && gun <= 30) {
                System.out.print("Burcunuz: Yay");
            } else {
                System.out.print("Doğduğunuz gün 1-30 aralığında girilmelidir.");
            }

        } else if (ay == 12) {
            if (1 <= gun && gun <= 21) {
                System.out.print("Burcunuz: Yay");
            } else if (22 <= gun && gun <= 31) {
                System.out.print("Burcunuz: Oğlak");
            } else {
                System.out.print("Doğduğunuz gün 1-31 aralığında girilmelidir.");
            }

        } else {
            System.out.print("Doğduğunuz ay 1-12 arasında girilmesi gerekmektedir. Yeniden Deneyin!");
        }
    }
}