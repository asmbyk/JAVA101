package javacalisma;

import java.util.Scanner;

//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
// ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
public class patika4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a, sayi = 0;
        for (; ; ) {
            System.out.println("bir sayı giriniz");
            a = k.nextInt();
            if (a % 2 == 1) {
                break;
            }else if (a%2==0 && a%4 == 0){
                sayi = a + sayi ;
            }
        }
        System.out.println("girdiginiz sayılardan ve 4 e bölnenlerin toplaı:     " + sayi);

    }
}
