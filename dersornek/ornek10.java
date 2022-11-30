package dersornek;

import java.util.Scanner;

//klavyeden girilen rastgele sayı arasında çiftlerin sayısı ve ortalamasını ekrana yazdırmak
public class ornek10 {
    public static void main(String[] args) {


        Scanner k = new Scanner(System.in);
        int toplam = 0, sayac = 0;
        for (int i = 0; ; ) {
            int a = k.nextInt();
            if (a % 2 == 0) {
                toplam = a + toplam;
                sayac++;
                System.out.println(toplam/sayac);

            }
        }
    }
}
