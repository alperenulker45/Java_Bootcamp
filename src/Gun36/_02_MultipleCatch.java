package Gun36;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _02_MultipleCatch {
    public static void main(String[] args) {
        // Kullanıcıdan 5 kez 2 şer adet sayı alınız ve bölüm sonucunu ekranda gösteriniz.
        // Oluşabilecek tüm hataları try-catch ile handle ediniz.

            for (int i = 0; i < 5; i++) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1. Sayiyi Giriniz");
                    int sayi1 = sc.nextInt();
                    System.out.println("2. Sayiyi Giriniz");
                    int sayi2 = sc.nextInt();
                    int bolum = sayi1 / sayi2;
                    System.out.println("bolum = " +bolum);
                }

                catch (ArithmeticException error) {
                    System.out.println("Lutfen ikinci sayiya 0 girmeyiniz");
                    i--;
                }

                catch (InputMismatchException error2) {
                    System.out.println("Lutfen Sayi Giriniz");
                    i--;
                }

        }

    }
}
