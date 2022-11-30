package dersornek;

import java.util.Scanner;

//klavyeden giren 4 BASAMKLI SAYININ BASAMAK DEGERİNİ BULAN PROGRAM
public class ornek9 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println(" 4 basamaklı bir sayı giriniz");
        int a = 0,b=a ,c ,d,g;
        a = k.nextInt();
        b= a ;
        c = a/1000;
        d = (a-c)/100;
        g = (d);

        System.out.println(a/1000 +" binler basamagı varıdr");


        System.out.println(a/100 +"yüzler basamagı vardır");
        System.out.println(a/10+ "onlarlarbasamagı vardır ");
    }
}
