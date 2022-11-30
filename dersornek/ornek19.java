package dersornek;

import java.util.Scanner;

//klavyeden girilen 3 basamaklı sayıların rakamların çarpımını bulan
public class ornek19 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b,c,d;
        b = a/100;
        a = a- (a/100)*100;
        c = a/10;
        d = a%10 ;
        System.out.println(b*c*d);
    }
}
