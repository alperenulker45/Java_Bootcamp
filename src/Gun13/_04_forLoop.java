package Gun13;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama kadar (sayi dahil degil) olan sayıların toplamını bulunuz.

        Scanner sc=new Scanner(System.in);
        System.out.print("Sayi Giriniz= ");
        int sayi= sc.nextInt();
        int toplam=0;

        for (int i=0; i<sayi; i++)
        {
            toplam= toplam+i;
        }
        System.out.println("toplam = " + toplam);

    }
}
