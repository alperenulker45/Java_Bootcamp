package Gun09;

import java.util.Scanner;

public class _08_Ornek7 {
    public static void main(String[] args) {
        //Girilen bir sayinin pozitif negatif veya sifir oldugunu yazdiriniz.

        Scanner giris= new Scanner(System.in);
        System.out.print("Sayi Giriniz= ");
        int sayi= giris.nextInt();
        if (sayi<0) {
            System.out.println("Sayi Negatif");
        }
        else if (sayi==0) {
            System.out.println("Sayi Sifir");
        }
        else {
            System.out.println("Sayi Pozitif");
        }
    }
}
