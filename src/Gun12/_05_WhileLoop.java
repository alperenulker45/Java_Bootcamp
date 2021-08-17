package Gun12;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü buluarak yazdırınız.
        Scanner giris= new Scanner(System.in);

        int enbsayi=0;
        int i=0;
        while (i<5) {
            System.out.print("Sayi Giriniz= ");
            int sayi= giris.nextInt();
            if (sayi>enbsayi) enbsayi=sayi;
            i++;
        }
        System.out.println("enbsayi = " + enbsayi); // bu soru pozitif sayilar icin gecerli oluyor.
                                                    // sayilarin tamami negatif girildiginde sonuc vermez.
    }
}
