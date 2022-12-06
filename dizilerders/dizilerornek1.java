package dizilerders;

import java.util.Scanner;

// klavyeden girilen 10 tane  sayı tutulmak isteniyor
public class dizilerornek1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a[] =new int[10]; // new hafızaya atıyor ( somutlaştırma )
        for ( int  i =0 ; i<10; i++){
            a[i]= k.nextInt(); // 10 tane sayıyı tutan diziyi yazmış olduk .
        }
    }
}
