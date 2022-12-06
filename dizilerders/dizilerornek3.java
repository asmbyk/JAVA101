package dizilerders;

import java.util.Scanner;

//klavyeden igirle 10 tane sayıyı içinden aritmeti ortalama degerinden küçük olanları ve bunların indislerini ekrana yazan program
public class dizilerornek3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a[] = new int[10];
        int t = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = k.nextInt();
            t = t + a[i];

        }
        double ortalama = (double) t / (double) a.length;
        for (int i = 0; i < 10; i++) {
            if (a[i] < ortalama) ;
            System.out.println(a[i] + " " + i);
        }

    }
}
