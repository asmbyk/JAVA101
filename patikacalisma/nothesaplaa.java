package patikacalisma;

import java.util.Scanner;
public class nothesaplaa {
    public static void main(String[] args) {
        int mat, fizik, turk ;
        Scanner ders = new Scanner(System.in) ;
        System.out.println("mat not :");
        mat = ders.nextInt() ;
        System.out.println("fiz not :");
        fizik = ders.nextInt() ;
        System.out.println("türk not :");
        turk = ders.nextInt() ;
        int toplam = mat+fizik+turk ;
        double sonuc =  toplam/3 ;
        System.out.println("ortalamanız" + sonuc);


    }
}
