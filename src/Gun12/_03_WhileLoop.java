package Gun12;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        //Girilen sayiya kadar olan sayilardan sadece tek sayilari toplayiniz.
        //Girilen sayi dahil

        Scanner giris= new Scanner(System.in);
        System.out.print("Sayi Giriniz= ");
        int sayi= giris.nextInt();
        int toplam=0;
        if (sayi%2==0) {
            while (sayi>0) {
                toplam=toplam+(sayi-1);
                sayi-=2;
            }
            System.out.println("toplam = " + toplam);
        }
        if (sayi%2==1) {
            while (sayi>0) {
                toplam=toplam+sayi;
                sayi-=2;
            }
            System.out.println("toplam = " + toplam);
        }
    }
}
