package Gun09;

import java.util.Scanner;

public class _02_Ornek1 {
    public static void main(String[] args) {
        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner giris= new Scanner(System.in);
        System.out.print("Vize Notunu Giriniz = ");
        int vize= giris.nextInt();
        System.out.print("Final Notunu Giriniz= ");
        int finalnot= giris.nextInt();
        double ortalama= ((vize*0.4)+(finalnot*0.6));
        System.out.println("ortalama = " + ortalama);

       /* if (ortalama>=60) {
            System.out.println("Gectiniz, Tebrikler");
        }
        else {
            System.out.println("Butunlemeye Kaldiniz");
        } */

        System.out.println(ortalama>=60? "Gectiniz tebrikler" : "Kaldiniz");


    }
}
