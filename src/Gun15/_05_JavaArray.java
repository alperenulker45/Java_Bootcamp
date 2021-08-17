package Gun15;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        int [] dizi= new int[7];
        Scanner sc=new Scanner(System.in);
        int i= dizi.length;

        for (i=0; i< dizi.length; i++)
        {
            System.out.print((i+1)+". Sayi Giriniz: ");
            dizi[i]= sc.nextInt();
            
        }
        int teksayi=0;
        for (i=0; i< dizi.length; i++)
        {
            if (dizi[i]%2==1)
            teksayi++;
        }

        System.out.println("teksayi = " + teksayi);
        
    }
}
