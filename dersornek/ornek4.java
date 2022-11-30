package dersornek;

import java.util.Scanner;

//2 ornegin sayı versiyonu
public class ornek4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a  = k.nextInt();
        for ( int i=0 ; i<a ; i++){
            for( int j = 0 ; j<a ;j++ ){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
