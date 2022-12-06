package metotlar;
//Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
//Palindrom Sayı Nedir ?
//Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
//Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
import java.util.Scanner;
public class metotlar {

        static boolean isPalindrom(int number) {
            int temp = number, reverse = 0, last;
            while (temp != 0) {
                last = temp % 10;
                reverse = (reverse * 10) + last;
                temp /= 10;
            }
            if (reverse == number)
                return true;
            else
                return false;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = input.nextInt();
            if (isPalindrom(n) == true) {
                System.out.println(n + " is a palindrome number.");
            } else {
                System.out.println(n + " is not a palindrome number.");
            }
        }
    }


