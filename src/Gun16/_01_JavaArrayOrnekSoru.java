package Gun16;

import java.util.Scanner;

public class _01_JavaArrayOrnekSoru {
    public static void main(String[] args) {
        //Kullanicinin girecegi bir cumlede kac kelime oldugunu bulunuz.

        Scanner sc=new Scanner(System.in);
        System.out.print("Cumle Giriniz: ");
        String text= sc.nextLine();

        int kelimesayisi=0;

        for (int i=0; i<text.length(); i++)
        {
            if (text.charAt(i)==' ')
                kelimesayisi++;

        }
        System.out.println("kelimesayisi = " + (kelimesayisi+1)); //kelime sayisi bosluklardan 1 fazla
        //veya i 1'den baslayabiliriz. o zaman kelime sayisi+1 demeye gerek kalmaz
    }
}
