package javacalisma;

import java.util.Scanner;

//Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
public class pratik5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        for (int i = 1; i <= a; i = i * 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
