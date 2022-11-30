package dersornek;

import java.util.Scanner;

// klavyeden girilen tam sayılar için (1 2 2 3 3 3 4 4 4 4 )
// seklinde yazan program
public class ornek7 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println(" bir sayı giriniz");
        int a = k.nextInt();

        for (int i =0 ; i<=a ;i ++){
            for ( int j =0 ; j<i ; j++){
                System.out.println(i);
            }


        }
    }
}
