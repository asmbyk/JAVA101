package dersornek;

import java.util.Scanner;

//klavyeden girilen 10 karakterlerde x yada X olanları bulup sayısını ekrana yazan program
public class ornek55 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayac = 0;
        for (int i = 1; i <= 10; i++) {
            char a = k.next().charAt(0);
            if (a == 'x' || a  == 'X') {
                sayac++;
            }

        }
        System.out.println(sayac);

    }
}
