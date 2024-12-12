import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        String kAdi = input.nextLine();
        System.out.print("Şifreniz:");
        String sifre = input.nextLine();

        if (kAdi.equals("Melike") && sifre.equals("Korkmaz")) {
            System.out.print("Hoşgeldiniz!");
        } else if (kAdi.equals("Melike") && (!sifre.equals("Korkmaz"))) {
            System.out.println("Şifre Hatalı!");
            System.out.print("1-Şifre Sıfırla\n2-Vazgeç\nŞifrenizi değiştirmek ister misiniz?(1 veya 2'yi Tuşlayınız)\n");
            int reset = input.nextInt();

            if (reset == 1) {
                Scanner inp = new Scanner(System.in);

                System.out.print("Yeni şifre giriniz:");
                String newpassword = inp.nextLine();

                if (newpassword.equals("Korkmaz")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.print("Şifre oluşturuldu");
                }

            } else if (reset == 2) {
                System.out.print("Yeniden giriş yapmayı deneyin.");
            }

        } else if ((!kAdi.equals("Melike")) && sifre.equals("Korkmaz")) {
            System.out.print("Kullanıcı Adı Yanlış!");
        } else {
            System.out.print("Yanlış Kullanıcı Adı ve Şifre");
        }
    }
}