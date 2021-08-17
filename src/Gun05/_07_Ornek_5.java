package Gun05;

import java.util.Scanner;

public class _07_Ornek_5 {
    public static void main(String[] args) {
        // kullanicidan boy ve kilosunu (ondalikli) alip ekrana tek seferde yazdiriniz

        Scanner imput= new Scanner(System.in);
        //oku.useLocale(Locale.UK); --> Okuma isleminde lokalizasyon (. ,) ayrimi icin kullanilabilir
        System.out.print("Boyunuzu Giriniz");
        double boy= imput.nextDouble();

        System.out.print("Kilonuzu Giriniz");
        double kilo= imput.nextDouble();

        System.out.println("Boyunuz=" + boy + " " + "kilonuz=" + kilo);
    }
}
