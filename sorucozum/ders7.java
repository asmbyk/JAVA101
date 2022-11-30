package sorucozum;

import java.util.Scanner;

// klavyeden girilen stringleri exit yazıncaya kadar  ekrana yazan program
public class ders7 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        for (; ; ) {
            String a = k.next();
            System.out.println(a);
            if (a.equals("EXIT")) {
                break;
            }
        }

    }
}
