package Gun09;

import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {
        //Girilen bir sayinin tek mi cift mi oldugunu yazdiriniz

        Scanner giris= new Scanner(System.in);
        System.out.print("Sayi Giriniz = ");
        int sayi= giris.nextInt();

        if (sayi%2==0) {
            System.out.println("Sayi Cifttir");
        }
        else System.out.println("sayi tektir");

       /// System.out.println(sayi%2==0? "sayi cifttir" : "sayi tektir"); bu sekilde if else kisayol yazdirilabilir.

    }
}
