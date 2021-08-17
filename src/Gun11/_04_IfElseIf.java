package Gun11;

import java.util.Scanner;

public class _04_IfElseIf {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik: 90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner giris= new Scanner(System.in);
        System.out.print("Ders ve Not Giriniz= "); // Fizik: 76 seklinde
        String dersNotu= giris.nextLine();

        int ogrNot=Integer.parseInt(dersNotu.replaceAll("[^0-9]", "")); //regex komutuyla
        //// sayi disindakileri bosalt denildi.
        String dersAd= dersNotu.replaceAll("[0-9]", "");

        System.out.println("Ogrenci Notu = " + ogrNot);
        System.out.println("Ders Adi = " + dersAd);

        if (ogrNot>=90)
            System.out.println("A");
        else
          if (ogrNot>=80)
            System.out.println("B");
            else
              if (ogrNot>=70)
                System.out.println("C");
              else
                 if (ogrNot>=60)
                System.out.println("D");
                else
                    if (ogrNot>=40)
                    System.out.println("E");
                else
                    System.out.println("F");


    }
}
