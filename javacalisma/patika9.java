package javacalisma;

import java.util.Scanner;

//Java ile girilen sayının harmonik serisini bulan program yazacağız.
public class patika9 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double a = k.nextInt();
        double totel, sonuc=0 ;
        for (double i = 1 ; i<=a ;i++) {
            totel = 1 / i;
            sonuc = totel + sonuc;
        }
        System.out.println(sonuc);
    }
}
