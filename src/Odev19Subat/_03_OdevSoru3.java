package Odev19Subat;

import java.util.Scanner;

public class _03_OdevSoru3 {
    public static void main(String[] args) {
        //3- girilen bir sayının basamaklarına göre tersi olan sayıyı bulunuz.
        Scanner giris=new Scanner(System.in);
        System.out.println("Sayi Giriniz= ");
        int sayi= giris.nextInt();
        int terssayi=0;

        while (sayi>0) {
            terssayi= terssayi*10; terssayi= terssayi + (sayi%10);
            sayi=sayi/10;
        }
        System.out.println("Girilen Sayinin Tersi = " + terssayi);

    }
}
