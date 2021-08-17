package Gun13;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        //Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
        //tamkare ise true  değilse false yazdırınız.

        Scanner sc= new Scanner(System.in);
        System.out.println("Sayi Giriniz= ");
        int sayi= sc.nextInt();
        int sayac=0;
        int aranansayi=0;

        while (sayac<sayi) {
            if (sayac*sayac==sayi) {
                aranansayi=sayac;
                break; // calistiginda donguyu keser, kirar.
            }
            sayac++;

        }

        if (aranansayi>0)
        System.out.println("true");

        else System.out.println("false");

        System.out.println("aranansayi = " + aranansayi);

    }
}
