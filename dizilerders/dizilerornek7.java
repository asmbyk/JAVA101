package dizilerders;

import java.util.Scanner;

// klavyeden girilen raskele anlamlı yada anlamsız 10 tane string giriliyor .
// bu stringler içerinde en uzun karaktere sahip olan  ilk stringin bulan
//a=   ekrana yazan
//b= indiksini ekrana yazan .
public class dizilerornek7 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String s[] = new String[10];
       int  indis = 0;
        for (int i = 0; i < 10; i++) s[i] = k.nextLine();
        int max = s[0].length();
        String ilk = s[0];
        for (int i = 1; i < 10; i++) {
            if (max <= s[i].length()) {
                max = s[i].length();
                ilk = s[i];
                indis = i;

            }
        }
        System.out.println(ilk + " " + indis);

    }
}
