package dizilerders;

import java.util.Scanner;

// aynı dizinin  aritmatik ortalamasını hesaplayan program .
public class dizilerornek2 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a[] = new int[10];
        int t = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = k.nextInt();
            t = t + a[i];

        }double ortalama = (double) t /10.0;
        System.out.println(ortalama);
        // sayı tipleri  arasındaki doöüsüm prpgram calısırken gercekleşebilir ve buna castingdenr
    }

}
