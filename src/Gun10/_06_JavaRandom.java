package Gun10;

import java.util.Scanner;

public class _06_JavaRandom {
    public static void main(String[] args) {
        //Girilen bir sayiya kadar random sayi aliniz.
        //kullanici ile ayni sayiyi verirse tebrikler yaziniz.

        Scanner giris= new Scanner(System.in);
        System.out.print("1-9 arasi sayi Giriniz = ");
        int girilenSayi= giris.nextInt();
        int randomSayi= (int) (Math.random()*10);
        System.out.println("randomSayi = " + randomSayi);
        if (girilenSayi==randomSayi)
            System.out.println("Tebrikler");
        else System.out.println("Malesef Kaybettiniz");

        //2. yontem Tenary Operator ile

        System.out.println(girilenSayi==randomSayi? "Tebrikler" : "Malesef Kaybettiniz");


    }
}
