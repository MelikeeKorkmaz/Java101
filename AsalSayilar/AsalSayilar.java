import java.util.Scanner;

//1 - 100 arasındaki asal sayıları ekrana yazdıran program

public class AsalSayilar {
    public static void main(String[] args) {
        int i, k, adet;
        Scanner input = new Scanner(System.in);

        for (i = 1; i <= 100; i++) {
            k = 1;
            adet = 0;
            while (k <= i) {
                int sonuc = i % k;
                if (sonuc == 0) {
                    ++adet;
                }
                k++;
            }
            if (adet == 2) {
                System.out.print(i + ",");
            }
        }
    }
}