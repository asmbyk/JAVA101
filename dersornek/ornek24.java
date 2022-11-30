package dersornek;

import java.util.Scanner;

//klavyeden girilen stringin polindrom olup olmadığını bulmak(polindrom:
// bir kelimenin tersten yazılışı aynı olan kelimedir örnek ada)
public class ornek24 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String b = k.nextLine();
        String a  = " ";
        for (int i=b.length()-1;i>=0;i--){
            a = a+b.charAt(i);
        }if (a.equals(b)){
            System.out.println("dogru");
        }else {
            System.out.println("degil");
        }
    }
}
