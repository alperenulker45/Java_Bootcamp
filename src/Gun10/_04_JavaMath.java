package Gun10;

import java.util.Scanner;

public class _04_JavaMath {
    public static void main(String[] args) {
        //Math.max yontemi ile girilen 3 sayidan buyuk olani bulunuz.

        Scanner giris= new Scanner(System.in);
        System.out.print("sayi giriniz= ");
        int sayi1= giris.nextInt();
        System.out.print("sayi giriniz= ");
        int sayi2= giris.nextInt();
        System.out.print("sayi giriniz= ");
        int sayi3= giris.nextInt();

        int enBuyukSayi= Math.max(sayi1, Math.max(sayi2, sayi3));
        System.out.println("enBuyukSayi = " + enBuyukSayi);

        // 2. yontem olarak

        int enb=Math.max(sayi1, sayi2);
            enb=Math.max(enb, sayi3);
        System.out.println("enbuyuksayi = " + enb);

        int enbuy= Math.max(Math.max(sayi1, sayi2), sayi3);
        System.out.println("enbuyuksayi = " + enbuy);
    }
}
