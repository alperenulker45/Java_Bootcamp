package Gun13;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayıların (sahil dahil) çarpımını (faktöryel) hesaplayınız.
        // 5! =>  54321

        Scanner sc=new Scanner(System.in);
        System.out.println("Sayi Giriniz: ");
        int sayi= sc.nextInt();
        int carpim=1;

        for (int i=1; i<=sayi; i++)
        {
        carpim= carpim*i;
        }
        System.out.println("carpim = " + carpim);

        // IKINCI YONTEM....

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Sayi Giriniz: ");
        int sayi= sc.nextInt();
        int carpim=1;
        
        for (;sayi>0; sayi--)
        {
        carpim=carpim*sayi;    
        }
        System.out.println("carpim = " + carpim); */
    }
}
