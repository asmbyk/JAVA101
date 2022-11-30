package patikacalisma;

import java.util.Scanner;

public class ciftbulanprogram {
    public static void main(String[] args) {
        int k ;
        Scanner inp = new Scanner(System.in);
        k = inp.nextInt();
        for (int i = 0;i<=k;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

    }
}
