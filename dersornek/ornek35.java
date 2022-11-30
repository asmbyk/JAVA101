package dersornek;

import java.util.Scanner;

// klavyeden girilen 10 tane sayının eşit olup olmadığını bulan
public class ornek35 {
    public static void main(String[] args) {


        Scanner k = new Scanner(System.in);
        int esit = 0, b = 0, sayac = 0, sayac1;
        for (int i = 1; i <= 10; i++) {
            esit = b;
            int a = k.nextInt();
            b = a;

            if (a == esit) {
                sayac++;

            }

        }
        if (sayac >1) {
            System.out.println("sayılar eşit");
        } else {
            System.out.println("sayılar esit degil");
        }
    }
}
