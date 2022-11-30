package dersornek;

import java.util.Scanner;

// a üzeri b cözen progrma
public class ornek56 {
    public static void main(String[] args) {
        Scanner k  = new Scanner( System.in);
        System.out.println("bir sayı girinis");
        int a = k.nextInt();
        System.out.println("bir sayı giriniz");
        int c = k.nextInt();
        int toplam = 1;
        for ( int i = 1 ; i<=c ; i++){
            toplam = a* toplam;

        }
        System.out.println(toplam);
    }
}
