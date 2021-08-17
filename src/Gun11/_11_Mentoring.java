package Gun11;

import java.util.Scanner;

public class _11_Mentoring {
    public static void main(String[] args) {

        Scanner giris=new Scanner(System.in);
        System.out.print("Sayi Giriniz= ");
        int sayi1= giris.nextInt();
        System.out.print("Sayi Giriniz= ");
        int sayi2= giris.nextInt();
        System.out.print("Sayi Giriniz= ");
        int sayi3= giris.nextInt();

        int enkucuk= sayi1;

        if (enkucuk>sayi2) enkucuk=sayi2;
        if (enkucuk>sayi3) enkucuk=sayi3;

        System.out.println("enkucuk = " + enkucuk);
    }
}
