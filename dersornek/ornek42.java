package dersornek;

import java.util.Scanner;

//klavyeden girilen 5 sayının maximum ve minumum değerini bulan
public class ornek42 {
    public static void main(String[] args) {
        int min , max ;
        Scanner k = new Scanner(System.in);
        int b=k.nextInt();
        min=b;
        max=b;
        for (int i = 1; i <= 4; i++) {
            int a = k.nextInt();
            if (max < a) {
                max = a;
            } else if (min > a) {
                min = a;
            }
        }
        System.out.println("sayının en büyügü   ; " + max + " - sasyının en kücük degeri ; " + min);

    }
}
