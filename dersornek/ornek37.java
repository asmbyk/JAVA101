package dersornek;

import java.util.Scanner;

//klavyeden girilen üç tamsayısı sıralayan programı gerçekleştiriniz
public class ornek37 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a , b ,c ;
        System.out.println("birinci sayıyı giriniz");
        a= k.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        b= k.nextInt();
        System.out.println("üçüncü sayıyı giriniz");
        c= k.nextInt();
        if(a>b && a>c){
            if(b>c){
                System.out.println(a +">"+b+">"+c);
            }else {
                System.out.println(a+">"+c+">"+b);
            }
        }else if (b>a && b>c){
            if(a>c){
                System.out.println(b+">"+a+">"+c);
            }else {
                System.out.println(b+">"+c+">"+a);
            }
        }else if (c>a && c>b){
            if(a>b){
                System.out.println(c+">"+a+">"+b);
            }else {
                System.out.println(c+">"+b+">"+a);
            }
        }
    }
}
