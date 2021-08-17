package Gun12;

import java.util.Scanner;

public class _02_WhileLoop {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.print("Sayi Giriniz= ");
        int sayi= giris.nextInt();
        int yedeksayi=sayi; // ikinci yontem icin giris yaptik bunu
        int toplam=0;

        while (sayi>0) {
            toplam=toplam+sayi;
            sayi--;
            // yukaridaki ifade yerine toplam=toplam+sayi-- yapilabilir.
        }
        System.out.println("toplam = " + toplam);

        // sayacli yontem
        int sayac=0;
        toplam=0;
        while (sayac<=yedeksayi) {
            toplam=toplam+sayac;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
