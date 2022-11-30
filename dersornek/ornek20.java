package dersornek;

import java.util.Scanner;

//klavyeden girilen 10 tam sayının 5 in katı olmayanlarının toplamını bulan
public class ornek20 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int toplam =0 ;
        for( int i= 1; i<=10 ; i++ ){
            int a = k.nextInt();
            if (a%5==0){
                toplam = toplam + a ;
            }
        }
        System.out.println(toplam);
    }
}
