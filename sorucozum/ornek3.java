package sorucozum;

import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        // klavyeden girilen stringi ekrana ;
        // a
        //la
        //ila seklinde yazan programı yazınız .
        String a;
        Scanner k = new Scanner(System.in);
        System.out.println("lütfen kelime giriniz.");
        a = k.next();
        for(int i = 0 ; i<a.length(); i++ ){
            for( int j = 0 ; j<=i ;j ++){
                System.out.print(a.charAt(a.length()-j)+ " ");
            }
            System.out.println(" ");
        }
    }
}
