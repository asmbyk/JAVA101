package lapjava;
//[(1+1).(1+2),(1+3)]+[(2+1).(2+3)..........
public class ornek1 {
    public static void main(String[] args) {
        int toplam =0 , carpim =1;
        for(int k=1 ; k<=4;k++){
            for(int m=1;m<=3;m++){
                carpim = (m+k)*carpim;

            }toplam = toplam + carpim;
            carpim =1 ;
        }
        System.out.println(toplam);
    }
}
