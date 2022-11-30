package dersornek;

import java.util.Scanner;

//klavyeden girilen stringleri exit yazıncaya kadar ekrana yazan
public class ornek21 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String b = " ";
        for(;;){
            String a = k.nextLine();
            if(a.equals("exit")){
                System.out.print(b);
                break ;
            }else {
                b = a + b;
            }
        }
    }
}
