package sorucozum;
// klavyeden giirilen tam sayıyı aşagıda sekilde yazan problem 5 girmek lazım
// 122333444455555
import java.util.Scanner;

public class ornek4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a ;
         a = k.nextInt();
         for (int i =0; i<=a ; i ++){
             for (int j = 1 ; j<=i ; j ++){
                 System.out.print(i +"");
             }

         }

    }
}
