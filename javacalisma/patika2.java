package javacalisma;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
// 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
public class patika2 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int a = k.nextInt();
        double toplam = 0;
                double sayac =0;
        for (int i = 0; i < a; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam = toplam + i;
                sayac++;
            }



        }System.out.println(toplam/sayac);

    }
}