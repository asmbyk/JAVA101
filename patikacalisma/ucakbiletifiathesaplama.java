package patikacalisma;//Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
// Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
// Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
// ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
//Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
// Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
//Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
//Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
//Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
//Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

import java.util.Scanner;

public class ucakbiletifiathesaplama {
    public static void main(String[] args) {
        int mesafe, yas, tip;
        double ilkUcret = 0.10, tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print(" 1--> Tek Yön, 2--> Gidiş Dönüş: ");
        tip = input.nextInt();

        tutar = mesafe * ilkUcret;
        switch (tip) {
            case 1:
                if (yas < 12) {
                    tutar *= 0.5;
                    System.out.println("Bilet tutarı: " + tutar + " TL");
                } else if (yas >= 12 && yas <= 24) {
                    tutar *= 0.9;
                    System.out.println("Bilet tutarı: " + tutar + " TL");
                } else if (yas > 65) {
                    tutar *= 0.3;
                    System.out.println("Bilet tutarı: " + tutar + " TL");
                } else {
                    System.out.print("Bilet tutarı: " + tutar + " TL");
                }
                break;

            case 2:
                tutar *= 1.6;
                if (yas < 12) {
                    tutar *= 0.5;
                    System.out.println("Bilet tutarı: " + tutar + " TL");
                } else if (yas >= 12 && yas <= 24) {
                    tutar *= 0.9;
                    System.out.println("Bilet tutarı: " + tutar + " TL");
                } else if (yas > 65) {
                    tutar *= 0.3;
                    System.out.println("Bilet tutarı: " + tutar + " TL");
                } else {
                    System.out.print("Bilet tutarı: " + tutar + " TL");
                }
                break;
            default:
                System.out.print("Hatalı veri girdiniz.");
        }

    }
}


