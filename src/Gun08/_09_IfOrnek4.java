package Gun08;

import java.util.Scanner;

public class _09_IfOrnek4 {
    public static void main(String[] args) {
        //Girilen bir sayinin tek mi cift mi oldugunu yazdiriniz.

        Scanner input= new Scanner(System.in);
        System.out.print("Sayi Giriniz");
        int sayi= input.nextInt();

        if (sayi<0)
            sayi=-sayi; //eksi degeri pozitife cevirip devam ediyor.

        if (sayi%2==0){
            System.out.println("Cift");
        }

        if (sayi%2==1){
            System.out.println("Tek");
        }

        // diger bir cozum olarak
        // sayi%2==0
        // sayi%2!=0 olarak yaparsak hem pozitif hem negatif icin calisir.
    }
}
