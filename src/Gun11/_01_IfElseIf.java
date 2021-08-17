package Gun11;

import java.util.Scanner;

public class _01_IfElseIf {
    public static void main(String[] args) {
        // Bir otopark ücret hesaplama programı yapılmak isteniyor.
        // 0-2 saat ara 5 €, 2-5 arası 10 € , 5 saatten sonra 15 € olarak
        // saat girildiğinde ücreti yazdırınız.

        Scanner giris= new Scanner(System.in);
        System.out.print("Otoparkta Kalinan Sureyi Giriniz= ");
        int saat= giris.nextInt();

        if (saat <=2)
            System.out.println("5 €");
        else if (saat <=5)
            System.out.println("10 €");
        else
            System.out.println("15 €");

        //2. yontem Tenary Operator ile

        String ucret= saat <=2 ? "5 €" : (saat <=5 ? "10 €" : "15 €");
        System.out.println("ucret = " + ucret);

    }
}
