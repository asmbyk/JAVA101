package dersornek;

import java.util.Scanner;

//klavyeden girilen a ve b sayıları arasındaki sayıları yazdıran program
public class ornek45 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = k.nextInt();
        a = a+1;
        for ( int i=a ;i<b;i++){
            System.out.println(i);
        }
    }
}
