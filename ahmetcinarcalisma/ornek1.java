package ahmetcinarcalisma;

import java.util.Scanner;

public class ornek1 {
    public static void main(String[] args) {
        //girilen sayının 13 bölünüp bölünmedigini bulan program .
        double a;
        Scanner k = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        a = k.nextDouble();
        if (a%13 == 0){
            System.out.println("sayı 13'e tam bölünüyor");
        }else
        System.out.println("sayı 13'e tam bölünmüyor.");
    }
}
