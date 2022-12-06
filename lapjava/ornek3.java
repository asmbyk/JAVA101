package lapjava;

import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        Scanner klav = new Scanner(System.in);
        int k = klav.nextInt();
        int t = klav.nextInt();
        int toplam = 0;
        int carpim = 1;
        int fak = 1;
        for (int n = 1; n <= k; n++) {
            for (int m = n; m <= t; m++) {
                carpim = carpim * 2 * m;
            }
            int i = n;
            while (i > 0) {
                fak = i * fak;
                i--;
            }
            toplam = toplam + (fak + carpim);
            carpim = 1;
            fak = 1;

        }
        System.out.println(toplam);
    }
}
