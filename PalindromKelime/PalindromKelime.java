//Kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir
//Kelimenin palindrom olup olmadığını yazdıran program.

import java.util.Scanner;

public class PalindromKelime {
    static boolean isPalindrome(String str) {
        int i, j, last;
        for (i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " kelimesi palindromdur.");
        } else {
            System.out.println(word + " kelimesi palindrom değildir.");
        }
    }
}