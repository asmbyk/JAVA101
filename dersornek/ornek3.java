package dersornek;

import java.util.Scanner;

// ornek 2nin tersi
public class ornek3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String a = k.next();
        for (int i = 0; i < a.length(); i++) {
            for ( int j = 0 ;j<=i ; j ++) {
                System.out.print(a.charAt(a.length()-j-1)+" ");
            } System.out.println(" ");

        }

    }
}
