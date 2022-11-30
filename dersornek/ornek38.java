package dersornek;

import java.util.Scanner;

//klavyeden girilen 1-25 arasındaki bir tam sayının faktöriyelini alan program
public class ornek38 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int fak = 1;
        for (int i = 1; i <= a; i++) {
            if (a >= 1 && a < 25) {
                fak = i * fak;
            } else {
                System.out.println("1le 25 arası ir sayı girmediniz.");
                break ;
            }

        }System.out.println(fak);
    }
}