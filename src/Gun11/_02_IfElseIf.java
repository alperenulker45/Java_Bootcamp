package Gun11;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner giris=new Scanner(System.in);
        System.out.print("Sayi Giriniz= ");
        int sayi1= giris.nextInt();
        System.out.print("Sayi Giriniz= ");
        int sayi2= giris.nextInt();

        System.out.print("Islem Giriniz= ");
        String islem= giris.next();

        if (islem.equalsIgnoreCase("T"))
            System.out.println(sayi1+sayi2);

        else
            if (islem.equalsIgnoreCase("C"))
            System.out.println(sayi1-sayi2);

         else
             if (islem.equalsIgnoreCase("P"))
                System.out.println(sayi1*sayi2);

         else
             if (islem.equalsIgnoreCase("B"))
             System.out.println(sayi1/sayi2);

    }
}
