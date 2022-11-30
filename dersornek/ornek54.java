package dersornek;

import java.util.Scanner;

// klavyeden girilen sayının asal olup olmadıını bulan program
public class ornek54 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt(), sayac = 0;
        for (int i = 2; i <= a; i++) {
            for (int j = 2; i < j; j++) {
                if (i%j == 0) {
                    System.out.println(j);
                }
            }
        }
    }
}
