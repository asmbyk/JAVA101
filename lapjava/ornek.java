package lapjava;

import java.util.Scanner;

// kulanıcıdan sayı al asal bölenlerini yazdır.
public class ornek {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        for (int sayi = 2; sayi <= a; sayi++) {
            int bolum;
            for (bolum = 2; bolum < sayi; bolum++) {
                if (sayi % bolum == 0)
                    break;
            }

            if (bolum == sayi) {
                //System.out.println(sayi);
                if (a % sayi == 0) {
                    System.out.println(sayi);
            }

            }
        }
    }
}
