package javacalisma;

import java.util.Scanner;

// Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
public class patika1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a = k.nextInt();
        for (int i=0; i<a ; i++){
            if (i%2==0){
                System.out.println("kulanıcının girdigi sayıdaki cift degelrler");
                System.out.println(i);
            }
        }
    }
}
