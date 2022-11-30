package dersornek;

import java.util.Scanner;

//klavyeden büyüklük girilerek yıldızlardan üçgen oluşturmak
public class ornek51 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
