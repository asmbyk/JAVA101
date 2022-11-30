package dersornek;

import java.util.Scanner;

//klavyeden girilen sayı kadar fibonaccı sayısını bulmak
public class ornek28 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b1 = 0, b2 = 1, b3;
        System.out.println(b2);
        for(int i =2;i<a;i++){
            b3=b2+b1;
            System.out.println(" "+b3);
            b1 = b2;
            b2=b3;

    }

}
}
