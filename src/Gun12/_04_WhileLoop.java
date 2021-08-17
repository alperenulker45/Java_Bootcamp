package Gun12;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        //Girilen sayiya kadar olan sayilardan sadece tek olanlari ekrana yadiriniz.
        //Girilen sayi dahil.

        Scanner giris=new Scanner(System.in);
        System.out.print("Sayi Giriniz");
        int sayi= giris.nextInt();
        while (sayi>0) { //sayi 0'dan buyuk iken
            if (sayi%2==1) //sayinin 2'ye bolumunden kalan 1 ise ekrana yaz ve sayiyi 1 azalt islemi yapiyoruz.
                            // cift sayilarda kosul saglanmadigi icin ekrana yazmiyor.
                System.out.println(sayi);
            sayi--;
        }
    }
}
