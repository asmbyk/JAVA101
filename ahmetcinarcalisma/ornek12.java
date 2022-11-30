package ahmetcinarcalisma;

import java.util.Scanner;

public class ornek12 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in) ;
        double a , toplam  = 0;
        for (;;){
            System.out.println("sayı giriniz");
            a = k.nextDouble();
            toplam = a+ toplam;
            if (a == -999){

                System.out.println("program sonlandı " + (toplam+999)); System.exit(1);
            }
        }
    }
}
