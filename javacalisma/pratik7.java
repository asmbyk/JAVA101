package javacalisma;
import java.util.Scanner;
//Java ile faktöriyel hesaplayan program yazıyoruz. 5 girdin 5*4*3*2*1
public class pratik7 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int sayac = 1;
        for (int i = 1; i <= a; i++) {

            sayac = i * sayac ;

        }
        System.out.println(sayac);

    }
}
