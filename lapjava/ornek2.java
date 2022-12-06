package lapjava;

public class ornek2 {
    public static void main(String[] args) {
        int fak = 1, ust = 1, toplam = 0,carp =1;
        for (int m = 1; m <= 3; m++) {
            fak = m * fak;
            for (int n = 2; n <= m; n++) {
                ust = m *ust;
                carp =(ust * fak)+carp;
                toplam = carp +(ust+carp);
            }
            System.out.println(toplam);
        }



    }

}

