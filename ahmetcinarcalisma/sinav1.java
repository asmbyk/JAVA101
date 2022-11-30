package ahmetcinarcalisma;

import java.util.Scanner;

//Klavyeden 4 adet tamsayı okuyan ve
// bu sayıların ortalamasını hesaplayıp ekrana yazdıran bir program yazınız.
public class sinav1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in) ;
        int sayi , toplam =0;
        double ort ;

        for (int i =0 ; i<4 ; i ++ ) {
            System.out.println("bir tam sayı giriniz");
            sayi = k.nextInt();
            toplam = toplam + sayi;
        } ort = toplam/4;
        System.out.println("yazdıgınız sayının ortalaması "+ toplam/4);

    }
}
