package ahmetcinarcalisma;

import java.util.Scanner;

//klavyeden girilen rasgele 10 sayıdan en büyük ve en kücügünü bulup ekrana yazdıracak prog yazın.
public class sinav2 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in );
        double a ,min =99999999*999999 , max= 0  ;
        for(double i =0 ; i<10 ; i++) {
            System.out.println("bir sayı giriniz:");
            a = k.nextDouble();
            if(a<min){
                min = a ;

            }else if (a>max){
               max = a;

            }
        }System.out.println("en küük degeriniz" +min);
        System.out.println("en büyük deger"+ max);

    }
}
