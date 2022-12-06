package dizilerders;

import java.util.Scanner;

// klavyeden girilen 6 sayı içinde  :
// a => en büyük degeri bulan programı yapınız.
public class dizilerornek5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayi[] = new int[6];
        for (int i = 0; i < 6; i++) sayi[i] = k.nextInt(); // veri okuma
        int max = sayi[0];
        for (int i = 1; i < 6; i++) {
            if (max < sayi[i]) {
                max = sayi[i];
            }

        }
        System.out.println(max);

    }
}
