package dersornek;

import java.util.Scanner;

// klavyeden ardı ardına giren sayıları toplayan ve girilen sayı negatif olunca duran program
public class ornek41 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int toplam = 0;
        for (int i = 1; ; i++) {
            int a = k.nextInt();
            toplam = toplam + a;
            if (a < 0) {
                System.out.println("eksi sayı giridiniz program durdu.");
                toplam = toplam - a;
                System.out.println(toplam);
                break;
            }
        }

    }
}
