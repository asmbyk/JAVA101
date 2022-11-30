package javacalisma;

import java.util.Scanner;

//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
public class pratik6 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        for (int i = 1; i < a; i = i * 4) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
        for (int j = 1; j < a; j = j * 5) {
            if (j % 5 == 0) {
                System.out.println(j);


            }

        }
    }
}

