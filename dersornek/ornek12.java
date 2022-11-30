package dersornek;

import java.util.Scanner;

// s10- klavyeden girilen sayının asal sayı olup olmadığını bulmak
public class ornek12 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int sayac = 0;
        for (int i = 2; i <= a; i++) {
            for (int j = 2; i <= j; j++) {
                if (a % i == 0) {
                    sayac++;

                }
            }

        } if (sayac == 0) {
            System.out.println("sayı asaldır");
        }else {
            System.out.println("sayı asal degildir");
        }
    }
}

