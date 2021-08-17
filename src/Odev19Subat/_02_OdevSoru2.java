package Odev19Subat;

import java.util.Scanner;

public class _02_OdevSoru2 {
    public static void main(String[] args) {
        //2-Kullanıcnın gireceği 5 sayıdan onlar basamağı en büyük olan sayıyı bulunuz.
        Scanner giris= new Scanner(System.in);
        int enbsayi=0;
        int enb10=0;
        int i=0;

        while (i<5) {
            System.out.print("Sayi Giriniz= ");
            int sayi= giris.nextInt();
            int sayionlar= (sayi/10)%10;
            if (sayionlar>enb10) { enb10 = sayionlar; enbsayi = sayi; }
            i++;
        }
        System.out.println("Onlar Basamagi En Buyuk Sayi = " + enbsayi);

    }
}
