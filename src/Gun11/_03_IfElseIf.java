package Gun11;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        // Girilen bir sayının önce 100 den küçük ise, 100 den küçük yazsın
        // devamında 50 den küçük ise 50 den küçük yazsın
        // devamında 25 den küçük ise 25 den küçük yazsın.
        // ic ice if kullanilarak cozulecek...

        Scanner giris= new Scanner(System.in);
        System.out.println("0-100 Arasinda Sayi Giriniz= ");
        int sayi= giris.nextInt();

        if (sayi<100) {
            System.out.println("100'den kucuk");
            if (sayi<50) {
                System.out.println("50'den kucuk");
                if (sayi<25)
                    System.out.println("25'den kucuk");
            }
        }
    }
}
