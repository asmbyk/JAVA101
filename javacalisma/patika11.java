package javacalisma;

import java.util.Scanner;

//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
// ve bu sayıları ekrana yazan programı yazın.
public class patika11 {
    public static void main(String[] args) {
        Scanner K = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz");
        int a = K.nextInt();
        int max=0 , min=0 , b ;
        for ( int i =1 ; i<=a; i ++){
            System.out.println("sayı giriniz");
            b = K.nextInt();
            if (i==1) {
                max = b ;
                min = b ;
            }else if (b>max){
                max = b ;

            }else if (b<min) {
                min = b ;
            }
        }
        System.out.println("en kücük sayı "+ min);
        System.out.println("en büyük sayı "+ max);
    }
}
