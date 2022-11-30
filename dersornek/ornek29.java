package dersornek;

import java.util.Scanner;

// klavyeden girilen n sayısının 1 den n'e kadar toplamı
public class ornek29 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int toplam = 0;
        for (int i = 1; i <= a; i++) {
            toplam = i + toplam;
        }
        System.out.println(toplam);
    }
}
