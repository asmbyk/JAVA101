package dersornek;

import java.util.Scanner;

// klavyeden girilen stringi
// a
//al
//ali seklinde yazan
public class ornek2 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String a = k.next();
        for (int i = 0; i < a.length(); i++) {
            for ( int j = 0 ;j<=i ; j ++) {
                System.out.print(a.charAt(j)+" ");
            } System.out.println(" ");

        }
    }
}
