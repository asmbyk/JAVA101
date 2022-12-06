package dizilerders;

import java.util.Scanner;

// 20 kişilik sınıftaki ögrencilere ait ad- soyad , java notu bilgisi tutuluyor ,
// bu sınıftaki en yüksek notu oan ögrenciyi  bulup ekrana yazan  programı yapınız
public class dizilerornek8 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String sinif[] = new String[20];
        int not[] = new int[20];
        for (int i = 0; i < 20; i++) {
            sinif[i] = k.nextLine();
            not[i] = k.nextInt(); // ad soyad numara ve not okur
        } int max = not[0];
        String ogrenci = sinif[0];
        for (int i = 1; i < 20; i++) {
            if (max < not[i]) {
                max = not[i];
                ogrenci = sinif[i];
            }
            System.out.println(ogrenci);
        }
    }

}
