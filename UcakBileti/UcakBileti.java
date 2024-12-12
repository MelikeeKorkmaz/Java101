import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        /*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
 İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */
        Scanner input = new Scanner(System.in);
        int distance, age, journey;
        double roadDiscount, travelFee;

        System.out.print("Please enter the distance you will travel in kilometers:");
        distance = input.nextInt();

        if (distance < 0) {
            System.out.print("You entered incorrect data.");
        } else {
            travelFee = distance * 0.10;
            System.out.println("Your travel fee is:" + travelFee);

            System.out.print("1-Round Trip\n2-One Direction\nPlease select your trip type as 1 or 2:");
            journey = input.nextInt();

            switch (journey) {
                case 1:
                    travelFee -= travelFee * 0.2;
                    System.out.println("With roundtrip discount:" + travelFee);

                    System.out.print("Please enter your age:");
                    age = input.nextInt();

                    if (age < 0) {
                        System.out.print("You entered incorrect data.");
                    } else if (0 <= age && age < 12) {
                        travelFee -= travelFee * 0.5;
                        System.out.print("Your total ticket price:" + travelFee);
                    } else if (12 <= age && age <= 24) {
                        travelFee -= travelFee * 0.1;
                        System.out.print("Your total ticket price:" + travelFee);
                    } else if (24 < age && age <= 65) {
                        System.out.print("There is no discount in this age range. Your total ticket price:" + travelFee);
                    } else {
                        travelFee -= travelFee * 0.3;
                        System.out.print("Your total ticket price:" + travelFee);
                    }
                    break;
                case 2:
                    System.out.println("There is no price discount for one-way journeys.");

                    System.out.print("Please enter your age:");
                    age = input.nextInt();

                    if (age < 0) {
                        System.out.print("You entered incorrect data.");
                    } else if (0 <= age && age < 12) {
                        travelFee -= travelFee * 0.5;
                        System.out.print("Your total ticket price:" + travelFee);
                    } else if (12 <= age && age <= 24) {
                        travelFee -= travelFee * 0.1;
                        System.out.print("Your total ticket price:" + travelFee);
                    } else if (24 < age && age <= 65) {
                        System.out.print("There is no discount in this age range. Your total ticket price:" + travelFee);
                    } else {
                        travelFee -= travelFee * 0.3;
                        System.out.print("Your total ticket price:" + travelFee);
                    }
                    break;
            }
        }
    }
}