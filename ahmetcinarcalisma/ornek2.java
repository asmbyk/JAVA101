package ahmetcinarcalisma;

import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        double k ;
        Scanner b = new Scanner(System.in);
        System.out.println("sayı gir");
        k = b.nextDouble();
        if (k==0){
            System.out.println("sayı sıfırdır ");
        }else if (k<0){
            System.out.println("sayı negatiftir");
        }else  {
            System.out.println("sayı pozitiftir");
        }
    }
}
