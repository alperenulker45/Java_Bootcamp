package Gun12;

import java.util.Scanner;

public class _06_soru5NegatifHali {
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        System.out.print("Sayi Giriniz= ");
        int sayi= giris.nextInt();
        int enb=sayi;
        int sayac=1;

        while (sayac<5) {
        System.out.print("Sayi Giriniz= ");
        int sayi2= giris.nextInt();
        if (sayi2>sayi) enb=sayi2;
            sayac++; }
        System.out.println("enb = " + enb);
        ///Sayi Giriniz= -98
        //Sayi Giriniz= -67
        //Sayi Giriniz= -5
        //Sayi Giriniz= -3
        //Sayi Giriniz= -4
        //enb = -4 /...... bu degerlerde hata veriyor
    }
    
}
