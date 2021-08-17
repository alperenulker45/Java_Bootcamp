package Gun19;

import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        //Kullanıcıdan öğrenci adı ve notlarınız (60 70 90) şeklinde
        // 3 öğrenci ve 3 ders notu alınız bunların otalamasını
        // bir metotda bulduktan sonra sonucu ekrana ismet 75 şeklinde
        // yazdırınız main içerisinde.

        for (int i =0; i <3; i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ogrencinin ad ve soyadini giriniz: ");
            String adsoyad = sc.nextLine();
            System.out.println("Ogrencinin notlarini giriniz: ");// 40 50 60//
            String strnotlar = sc.nextLine();


            System.out.println("Ogrenci: " + adsoyad);
            System.out.println("Ortalamasi " + ortalamaBul(strnotlar));
        }



    }

    public static int ortalamaBul(String notlar)
    {
        int toplam=0;
        String [] notDizi= notlar.split(" ");

        for (int i = 0; i < notDizi.length ; i++)
        {
            toplam+=Integer.parseInt(notDizi[i]);
        }

        return toplam/ notDizi.length;
    }
}
