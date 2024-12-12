import java.util.Scanner;

//ATM işlemlerini yaptıran program.
public class BankaHesabi {
    public static void main(String[] args) {
        String kAdi, sifre;
        int hak = 3, secim;
        double bakiye = 3600;
        Scanner input = new Scanner(System.in);

        while (hak > 0) {
            System.out.print("Kullanıcı Adı: ");
            kAdi = input.nextLine();

            System.out.print("Şifre: ");
            sifre = input.nextLine();

            if (kAdi.equals("Melike") && sifre.equals("Korkmaz")) {
                do {
                    System.out.println();
                    System.out.println("Sisteme Hoşgeldiniz.");
                    System.out.println("Bakiyeniz: " + bakiye);
                    System.out.print("1-Para yatır\n2-Para çek\n3-Çıkış yap\n");
                    System.out.print("Yapmak istediğiniz işlemi tuşlayın: ");
                    secim = input.nextInt();

                    double miktar = 0;
                    switch (secim) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                            miktar = input.nextDouble();

                            bakiye += miktar;
                            System.out.println("Para yatırma işleminiz başarılı. Güncel bakiyeniz: " + bakiye);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            miktar = input.nextDouble();

                            if (miktar > bakiye) {
                                System.out.println("Girdiğiniz miktar, bakiyenizden fazla olmamalıdır. Lütfen tekrar deneyin. Bakiyeniz: " + bakiye);
                            } else {
                                bakiye -= miktar;
                                System.out.println("Para çekme işleminiz başarılı. Güncel bakiyeniz: " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Çıkış Yaptınız.");
                            break;

                        default:
                            System.out.println("Hatalı tuşlama yaptınız.");
                            break;
                    }
                } while (secim != 3);
                break;
            } else {
                --hak;
                System.out.println("Hatalı giriş yaptınız. Kalan hakkınız: " + hak);
            }
        }
    }
}