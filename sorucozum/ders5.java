package sorucozum;

// ilk 20 fibonanci sayısını ekrana yazan ve toplamını yazan program program
public class ders5 {
    public static void main(String[] args) {
        int a = 1, b = 1, c, top = 2;

        for (int i = 3; i <= 20; i++) {
            c = a + b;
            System.out.println(c);
            top = c + top;
            a = b;
            b = c;


        }
        System.out.println(top);
    }


}

