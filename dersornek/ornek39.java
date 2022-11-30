package dersornek;

import java.util.Scanner;

// klavyeden ardı ardına sayı girişi isteyen ve bu sayı 10-15 arasında olmadığı sürece devam eden program
public class ornek39 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        for(int i =0 ;;i++){
            int a = k.nextInt();
            if (a>10 && a<15){
                break ;
            }
        }
    }
}
