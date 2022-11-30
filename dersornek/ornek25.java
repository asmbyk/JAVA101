package dersornek;

import java.util.Scanner;

//kalvyeden girilen sayı kadar sayıyı yazdıran
public class ornek25 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        for (int i =1 ;i<=a; i ++){
            System.out.println(a+" ");
        }
    }
}
