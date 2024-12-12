/*  
    Dizideki sayıların harmonik ortalamasını hesaplayan program
    Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
    Harmonik Seri Formülü :
    1 + 1/2 + 1/3 + 1/4 +...+ 1/n
 */

public class HarmonikOrtalama {
    public static void main(String[] args) {
        double total = 0, result;
        int[] list = {3, 2, 4, 5, 5, 9};

        for (int i = 0; i < list.length; i++) {
            total += (1.0 / list[i]);
        }

        result = list.length / total;
        System.out.print("Dizideki elemanların harmonik ortalaması:\t" + result);
    }
}