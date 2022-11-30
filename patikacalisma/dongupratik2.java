package patikacalisma;

import java.util.Scanner;

public class dongupratik2 {
    public static void main(String[] args) {
        int n ;

        //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
        System.out.println("bir sayı giriniz:");
        Scanner k = new Scanner(System.in);
        n= k.nextInt();
        System.out.println(" sayının 2 katı olan kuvetleri");
        for (int i=1 ;i<n;i = i*2 ) {

            System.out.println(i);
    }
        }
}
