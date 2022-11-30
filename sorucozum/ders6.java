package sorucozum;

import java.util.Scanner;

// klavyeden girilen sayının asal sayı olup olmadıgını ekrana yazan program
public class ders6 {
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in) ;
        boolean t=true;
        int sayi =k.nextInt();
        for(int i = 2 ; i<=Math.sqrt(sayi);i++){
            t= false;
            break;
        }if(t){
            System.out.println("asaldir");
        }else {
            System.out.println("degil");
        }

    }
}
