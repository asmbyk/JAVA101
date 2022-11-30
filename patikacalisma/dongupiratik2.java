package patikacalisma;

import java.util.Scanner;

public class dongupiratik2 {
    public static void main(String[] args) {
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        int n , totel1=0, totel2=0, sontotel;
        Scanner k = new Scanner(System.in);
        do {
            System.out.println("litfen bir sayı giriniz :");
            n = k.nextInt();
            if (n%2==0 || n%4==0){
                totel1 = n + totel1 ;
            }
        }while(n%2 ==0);

        System.out.println("cift ve 4 ün katı olan sayıların toplamı :"+ totel1);
    }
}
