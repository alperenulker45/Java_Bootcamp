package Gun11;

import java.util.Scanner;

public class _12_mentoring {
    public static void main(String[] args) {
        //Girilen 3 sayidan en kucugu ekrana yazdiriniz

        Scanner scr= new Scanner(System.in);
        System.out.print("1.Sayiyi giriniz=");
        int sayi1=scr.nextInt();
        System.out.print("2.Sayiyi giriniz=");
        int sayi2=scr.nextInt();
        System.out.print("3.Sayiyi giriniz=");
        int sayi3=scr.nextInt();


        int min=sayi1;

        if (min > sayi2){  min = sayi2; }
        if (min > sayi3){  min = sayi3; }

        System.out.println("enkucuk sayi = " + min);
    }
}
