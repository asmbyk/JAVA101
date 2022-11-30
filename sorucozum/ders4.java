package sorucozum;

import java.util.Scanner;

// klavyeden sürekli olarak girilen stringler içerisinde uzunlugu 5kez  5ten az olan stringlerin toplayan  java programı yazınız.
public class ders4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String str =" ";
        int  sayac=0 ;
        for(int i = 0 ; ;i++){
            String a = k.nextLine();
            if(a.length()==5){
                str = str+a ;
                sayac++;
                if (sayac==5){
                    System.out.println("program bitti");
                    break;
                }
            }
        }


    }
}
