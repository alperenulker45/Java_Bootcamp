package Gun10;

import java.util.Scanner;

public class _07_06HocaCozum {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi =");
        int kacaKadarRandomSayi= oku.nextInt(); // 4

        int uretilenSayi = (int)(Math.random() * kacaKadarRandomSayi); // 4 kadar üretildi, 1,2,3

        System.out.print("Sayı tahmininiz = ");
        int tahmin = oku.nextInt();

        // 1.yöntem normal if ile
        if (uretilenSayi == tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemedinki bilemedinki");

        //2.yöntem Ternary Operatör ile
        String sonuc = (uretilenSayi==tahmin) ? "Tebrikler" : "Bilemedinki bilemedinki" ;
        System.out.println("sonuc = " + sonuc);

        System.out.println("uretilenSayi = " + uretilenSayi);
    }

}
