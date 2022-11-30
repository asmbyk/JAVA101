package patikacalisma;

import java.util.Scanner;
public class ucgen {
    public static void main(String[] args) {
        double a, b,c1, c2 ;
        Scanner k =new Scanner(System.in);
        System.out.println("1.kenarı giriniz :");
        a=k.nextDouble();
        System.out.println("2. kenarı giriniz");
        b=k.nextDouble();

        c1=(a*a)+(b*b);
        c2= Math.sqrt(c1);
        System.out.println("sonuc:"+c2);

    }
}
