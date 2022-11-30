package dersornek;

import java.util.Scanner;

//klavyeden girilen stringi aşagıdaki sekilde yazdıran.
public class ornek57 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String a = k.next();
        for (int i = 0 ; i<=a.length();i++){
            for(int j = 0 ;j<=i;j++){
                System.out.print(a.charAt(a.length()-1-j));
            }
            System.out.println(" ");
        }

    }
}
