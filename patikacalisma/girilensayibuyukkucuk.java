package patikacalisma;

import java.util.Scanner;

//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
// ve bu sayıları ekrana yazan programı yazın.
public class girilensayibuyukkucuk {
    public static void main(String[] args) {
        double   n;
        int sayac  = 0 ;
        Scanner k = new Scanner(System.in);
        System.out.println("KAç tane sayı gireceksiniz");
        n = k.nextDouble();
        for (double i = 0;i <= n; i++) {
            sayac ++;

            i = k.nextDouble();System.out.println( sayac +"sayıyı ;" + i + " giridiniz");


        }

    }
}
