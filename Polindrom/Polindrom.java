public class Palindrom {

    //Bir sayının "Palindrom Sayı" olup olmadığını bulan bir program

    static boolean isPalindrom(int number) {
        int sonBasamak, yeniSayi, tersSayi = 0, sayi = number;

        while (sayi != 0) {
            sonBasamak = sayi % 10;
            sayi /= 10;
            tersSayi = (tersSayi * 10) + sonBasamak;
            System.out.println(tersSayi);
        }

        if (number == tersSayi) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print(isPalindrom(9));
    }
}