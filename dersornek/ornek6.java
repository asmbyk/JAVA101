package dersornek;

import java.util.Scanner;

// klavyeden girilen stringin kac tane aa karakteri vardır
public class ornek6 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String a = k.next();
        int sayac =0 ;
        for(int i =0 ; i<a.length() ; i++){
            if(a.charAt(i)== 'a'){
                if(a.charAt(i+1)== 'a'){
                 i = i+2;
                 sayac ++;
                }
            }
        }            System.out.println(sayac);

    }
}
