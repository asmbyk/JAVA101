package patikacalisma;

import java.util.Scanner;

public class faktoriel {
    public static void main(String[] args) {
        //Java ile faktöriyel hesaplayan program yazıyoruz.
        int n , totel=0;
        Scanner k = new Scanner(System.in) ;
        System.out.println("bir sayı giriniz:");
        n= k.nextInt();
        for ( int i=1; i<=n ;i++){
            totel= totel*i;


        }System.out.println(" toplam syınız ;" + totel);

    }
}
