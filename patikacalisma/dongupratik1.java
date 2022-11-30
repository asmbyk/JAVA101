package patikacalisma;

import java.util.Scanner;

//Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
// ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
public class dongupratik1 {
    public static void main(String[] args) {
        int n;
        int totel = 0;
        Scanner klavye = new Scanner(System.in);
        do {
            System.out.println("Sayı giriniz:");
            n = klavye.nextInt();
            if (n % 2 == 1) {
                totel = totel + n;
            }
        } while (n > 0);
        System.out.println("sayılaların toplamı :" + totel);
    }
}
