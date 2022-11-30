package patikacalisma;

import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        double pi = 3.14 , r ,a,c;
        Scanner s = new Scanner(System.in);
        System.out.print("yari capi giriniz :");
        r = s.nextDouble();
        a = pi*r*r ;
        c = 2*pi*r;
        System.out.println("daire alanı :"+ a);
        System.out.println("daire cevresi"+ c);






    }
}
