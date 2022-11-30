package sorucozum;
// stringi testen yazan program
import java.util.Scanner;

public class ornek5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in) ;
            String s = k.next();
            for(int i = s.length()-1 ; i>=0 ; i--){
                System.out.print(s.charAt(i));
            }
        }

    }

