package Gun09;

import java.util.Scanner;

public class _07_Ornek6 {
    public static void main(String[] args) {
        //yan yana aralarinda bir boslukla 2 int sayinin
        //birbirine esit olup olmadigini bulunuz.

        Scanner giris= new Scanner(System.in);
        System.out.print("Sayilari Bir Bosluk Birakarak Giriniz= ");
        String sayilar= giris.nextLine();
        int bosluk= sayilar.indexOf(" ");
        String strsayi1= sayilar.substring(0, bosluk);
        String strsayi2= sayilar.substring(bosluk+1);

        int sayi1= Integer.parseInt(strsayi1);
        int sayi2= Integer.parseInt(strsayi2);

        if (sayi1==sayi2) {
            System.out.println("Sayilar Esit");
        }
        else {
            System.out.print("Esit Degil");
        }

        //if (sayilar.substring(0, bosluk).equals(sayilar.substring(bosluk+1))) {
            //System.out.println("sayilar esit");
        // kisayol olarak bu sekilde de yapilabilir.



    }
}
