package javacalisma;
//Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
public class patika13 {
    public static void main(String[] args) {
        int counter = 0, i, j;
        for(i = 2; i <=100 ; i++){
            for(j = 2; j < i; j++) {
                if(i % j == 0){
                    counter++;
                    break;
                }
            }
            if(counter == 0)
                System.out.print(i + " ");
            counter = 0;
        }

    }
}
