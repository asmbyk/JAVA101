package dersornek;

import java.util.Scanner;

//bir fabrikada sabit maaşla çalışan işciler aile durumlarına göre ek maaş almaktadır.
// Çocuk sayısı 1 ise maaşın %5 i kada, 2 ise %10 u kadar, 3 ve daha fazlası için %15 ikadar aile yardımı almaktadır.
// Girilen maaş ve çocuk sayısına göre bu durumu hesaplayan program.
public class ornek44 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int zam = 0, zammas;
        System.out.println("maşanızı giriniz");
        int a = k.nextInt();
        System.out.println("cocuk sayınızı giriniz");
        int b = k.nextInt();
        switch (b) {
            case 1:
                zam = (a / 100) * 5;
                zammas = a + zam;
                System.out.println(zammas);
                break;
            case 2:
                zam = (a / 100) * 10;
                zammas = zam + a;
                System.out.println(zammas);
                break;

            default:
                zam = (a / 100) * 15;
                zammas = zam + a;
                System.out.println(zammas);
                break;


        }
    }
}