package Gun11;

import java.util.Scanner;

public class _06_SwitchCase {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.(switch kullanınız)

        Scanner giris=new Scanner(System.in);
        System.out.print("Tam Sayi Giriniz= ");
        int sayi1= giris.nextInt();
        System.out.print("Tam Sayi Giriniz");
        int sayi2= giris.nextInt();
        System.out.print("Islem Giriniz");
        String islem= giris.next();

        switch (islem) {//buradaki tip ne ise casedeki tiplerde o sekilde olmali.

            case "T" :
                System.out.println(sayi1+sayi2);
                break;
            case "C" :
                System.out.println(sayi1-sayi2);
                break;
            case "P" :
                System.out.println(sayi1*sayi2);
                break;
            case "B" :
                System.out.println(sayi1/sayi2);
                break;
            default:
                System.out.println("Hatali Giris");
        }
    }
}
