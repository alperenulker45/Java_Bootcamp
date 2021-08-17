package Odev24Subat;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class _02_Soru2 {
    public static void main(String[] args) {
        //2- // bilgisayar 0-10 arası sayı tutsun(Random). Kullanıcıdan en fazla 3 hak
        //// vererek sayıyı bulmasını isteyiniz.Bulduğunda tebrikler yazsın.

        Scanner sc=new Scanner(System.in);
        int random= (int) (Math.random()*10+1);
        int i=0;
        System.out.println("3 Tahmin Hakkiniz Vardir");
        System.out.print("1-10 Arasi Sayi Tahmin Ediniz: ");
        int tahmin;

        while (i<3)
        {
            tahmin= sc.nextInt();
            if (tahmin==random)
            {
            System.out.println("Bildiniz, Tebrikler");
            break;
            }
            else if (tahmin!=random && i<2)
                System.out.print("Bilemediniz, Tekrar Deneyin. ");
            i++;

            if (i==3)
            {
            System.out.println("Tahmin Hakkiniz Bitti");
            System.out.println("Random Sayi= " + random);
            break;
            }
            System.out.println(3-i + " Tahmin Hakkiniz Kaldi");
        }

    }
}
