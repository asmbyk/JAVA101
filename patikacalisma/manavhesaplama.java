package patikacalisma;

import java.util.Scanner;

public class manavhesaplama {
    public static void main(String[] args) {
        double armut = 2.14 ,elma= 3.67 , domates = 1.11 ,muz = 0.95 , patlican = 5 , ekilo  ,akilo ,pkilo ,dkilo,mkilo,sepet;
        Scanner klavye =  new Scanner(System.in) ;
        System.out.println("Kaç Kilo elma aldınız");
        ekilo= klavye.nextDouble();
        System.out.println("Kaç Kilo armut aldınız");
        akilo= klavye.nextDouble();
        System.out.println("Kaç Kilo patlıcan aldınız");
        pkilo= klavye.nextDouble();
        System.out.println("Kaç Kilo muz aldınız");
        mkilo= klavye.nextDouble();
        System.out.println("Kaç Kilo domates aldınız");
        dkilo= klavye.nextDouble();
        sepet = (dkilo * domates)  + (armut* akilo) + (ekilo *elma) + (muz *mkilo ) +(patlican* pkilo) ;
        System.out.println("spet tutarınız" + sepet);

    }

}
