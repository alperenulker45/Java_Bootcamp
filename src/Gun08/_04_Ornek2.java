package Gun08;

import java.util.Scanner;

public class _04_Ornek2 {
    public static void main(String[] args) {
        // Girilen 3 basamakli bir sayinin tersini bulunuz.

        Scanner input=new Scanner(System.in);
        System.out.println("3 Basamakli Sayi Giriniz");
        int sayi= input.nextInt();
        int basamak1= sayi%10;
        int basamak2= (sayi/10)%10;
        int basamak3= sayi/100;
        int tersi= basamak1*100+basamak2*10+basamak3;
        System.out.println("tersi = " + tersi);
        System.out.println("sonuc = " + basamak1 + basamak2 + basamak3);


    }
}
