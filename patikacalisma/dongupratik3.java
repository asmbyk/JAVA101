package patikacalisma;

import java.util.Scanner;

public class dongupratik3 {
    //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
    public static void main(String[] args) {
        int a ;
        Scanner k = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        a =k.nextInt();
        for (int i=5 ;i<a ;i =i*5){
            System.out.println(i);
        }for (int n=4 ;n<a;n= n*4){
            System.out.println(n);
        }

    }

}
