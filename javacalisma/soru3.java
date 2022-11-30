package javacalisma;
//klavyeden girilen  10 tam sayıdan  5 ve 5in katı olamayanları  toplamını hesaplayan

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayi;
        int toplam  = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("sayı giriniz");
            sayi = k.nextInt();
            if (sayi % 5 == 0) {

            }else {
                toplam = sayi + toplam ;
            }



        } System.out.println(toplam);

    }

}
