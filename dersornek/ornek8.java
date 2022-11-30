package dersornek;

import java.util.Scanner;

// klavyeden giren stringin tersini yazan program
public class ornek8 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in) ;
        String a = k.nextLine();
        for (int i =a.length()-1; i>=0; i--){
            System.out.print(a.charAt(i));

            }
        }
    }

