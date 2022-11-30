package sorucozum;

import java.util.Scanner;

public class ornek1 {
    public static void main(String[] args) {
        // klavyeden girilen a ve degerinegöre a üzeri b yi hesaplayan program
        double a ,b, sonuc = 1 ;
        Scanner k = new Scanner(System.in );
        System.out.println("1. sayıyı giriniz :");
        a = k.nextDouble();
        System.out.println("2. sayıyı giriniz");
        b = k.nextDouble() ;
        for (int i = 0 ; i <b ; i++){
            sonuc = sonuc*a ;
        }
        System.out.println("İlem sonucuz :"+ sonuc);
    }
}
