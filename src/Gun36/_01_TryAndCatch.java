package Gun36;

import java.util.Scanner;

public class _01_TryAndCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("1. Sayi Giriniz");
            int sayi1 = sc.nextInt();//kullanici int yerine string de girebilir ve exception olur.

            System.out.println("2.Sayi Giriniz");
            int sayi2= sc.nextInt();

            int bolum = sayi1/sayi2;
            System.out.println("bolum = " + bolum);
        }

        catch (Exception error) {

            System.out.println("Hata Mesaj" + " " + error.getMessage());
            error.printStackTrace();//detayli hatalari gosterir

        }





    }
}
