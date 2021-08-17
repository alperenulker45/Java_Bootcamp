package Gun08;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        //Girilen bir sayi 10 dan buyukse ekrana buyuk diye yazdiriniz.

        Scanner input= new Scanner(System.in);
        System.out.print("Sayi Giriniz= ");
        int number= input.nextInt();

        if (number>10) { //bu parantezi koda devam edeceksek koymamiz gerekiyor. sadece if kodu gireceksek
            //gerek duymuyor. eger kosul saglaniyorsa parantezin icini yapiyor. yoksa devam ediyor.
            System.out.println("Buyuk");
        }

    }
}
