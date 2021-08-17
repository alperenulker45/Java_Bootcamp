package Odev19Subat;

import java.util.Scanner;

public class _01_OdevSoru1 {
    public static void main(String[] args) {
        //1- Kullanıcıdan alacağınız 20 sayıdan en büyük olanını bulunuz
        Scanner giris=new Scanner(System.in);
        System.out.print("Sayi Giriniz= ");
        int sayi= giris.nextInt();
        int enbsayi=sayi;
        int i=1;
        
        while (i<20) {
            System.out.print("Sayi Giriniz= ");
            int sayi2= giris.nextInt();
            if (sayi2>enbsayi) enbsayi=sayi2;
            i++;
        }
        System.out.println("enbsayi = " + enbsayi);
        
    }
}
