package dersornek;

import java.util.Scanner;

//klavyeden girilen n sayısı için n!+2^n formülünü hesaplayan
public class ornek22 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int fak = 1 , sayac =0;
        for ( int i =1 ; i<=a; i++){
            fak = i* fak ;
            sayac ++ ;
        }
        System.out.println(fak+(2*sayac));

    }
}
