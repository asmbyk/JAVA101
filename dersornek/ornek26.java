package dersornek;

import java.util.Scanner;

//klavyeden girilen stringteki ilk a karakterinin indeksini yazan
public class ornek26 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String a = k.nextLine();
        for(int i=0; i<a.length();i++){
            if(a.charAt(i)=='a'){
                System.out.println(i);
                break;
            }
        }
    }
}
