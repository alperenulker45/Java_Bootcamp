package Gun11;

import java.util.Scanner;

public class _02_IFHocaCozum {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz = ");
        int sayi1 = oku.nextInt();

        System.out.print("2.Sayıyı giriniz = ");
        int sayi2 = oku.nextInt();

        System.out.println("Toplam T\nÇıkartma Ç\nÇarpma P\nBölme B\nGiriniz. ");
        Scanner okuStr = new Scanner(System.in);
        String islem=okuStr.next();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("toplam = " + (sayi1+sayi2));
        else
        if (islem.equalsIgnoreCase("Ç"))
            System.out.println("Çıkartma = " + (sayi1-sayi2));
        else
        if (islem.equalsIgnoreCase("P"))
            System.out.println("Çarpma = " + (sayi1*sayi2));
        else
        if (islem.equalsIgnoreCase("B"))
            System.out.println("Bölme = " + (sayi1/sayi2));
    }
}
