package javacalisma;

import java.util.Scanner;

//Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.
public class patika10 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        int a = k.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int b = k.nextInt();
        int ebob = 1;
        for (int i = a; i <= (b * a); i++) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
                System.out.println(ebob);
                break;
            }
        }
        for (int d = 1; d <= (b * a); d++) {
            if (d % a == 0 && d % b == 0) {
                System.out.println(k);
                break;
            }
            System.out.println((a * b) / ebob);
        }
    }
}