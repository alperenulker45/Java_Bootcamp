package Odev19Subat;

import java.util.Scanner;

public class _05_OdevSoru5 {
    public static void main(String[] args) {
        //5-Girilen bir sayının tersi ile aynı olup olmadığınız bulunuz.

        Scanner giris= new Scanner(System.in);
        System.out.print("Sayi Giriniz= ");
        int sayi= giris.nextInt();
        int girilensayi=sayi;
        int terssayi=0;

        while (sayi>0) {
            terssayi=terssayi*10; terssayi=terssayi+(sayi%10);
            sayi= sayi/10;
        }
        if (terssayi==girilensayi) System.out.println("Sayi Tersiyle Esittir");
        else System.out.println("Sayi Tersiyle Esit Degildir");

    }


}
