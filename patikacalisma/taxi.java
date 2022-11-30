package patikacalisma;

import java.util.Scanner;

public class taxi {
    public static void main(String[] args) {
        double kmb = 2.20 , km ,kmt , a  = 10;
        Scanner s = new Scanner(System.in);
        System.out.println("gideceginiz mesafeyi km cinsinden giriniz");
        km = s.nextDouble();
        kmt = km*kmb+ a ;
        kmt = (kmt <20) ? 20 : kmt ;
        System.out.println("maliyetiniz"+kmt);


    }
}
