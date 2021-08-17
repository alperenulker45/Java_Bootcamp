package Gun13;

import java.util.Scanner;

public class _07_forLoopGununSorusu {
    public static void main(String[] args) {
        // Girilen bir stringdeki a harfi sayısını bulunuz.
        // c harfine sıra gelirse döngüden çıkılsın

        Scanner sc=new Scanner(System.in);
        System.out.print("Cumle Giriniz: ");
        String str= sc.nextLine();
        int harfsayisi=0;


        for (int i=0; i<str.length()-1; i++) {
        if (str.substring(i, i+1).equals("a")) harfsayisi++;
        else if (str.substring(i, i+1).equals("c")) break;}



        System.out.println("a harfi sayisi = " + harfsayisi);

    }
}
