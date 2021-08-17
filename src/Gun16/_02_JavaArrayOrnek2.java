package Gun16;

import java.util.Scanner;

public class _02_JavaArrayOrnek2 {
    public static void main(String[] args) {
        //Kullanıcnın gireceği 6 sayıyı bir diziye attıktan sonra
        //bir sonraki kendisinden büyük kaç sayı olduğunu bulunuz ?

        Scanner sc=new Scanner(System.in);
        int [] dizi= new int[6];
        int kactane=0;
        for (int i=0; i<dizi.length; i++)
        {
            System.out.print("Sayi Giriniz: ");
            dizi[i] = sc.nextInt();
        }

        for (int i=0; i< dizi.length-1; i++) //dizi sinirinin disina gecmemesi icin length-1 yaptik
        {
            if (dizi [i]<dizi[i+1])
                kactane++;
        }


        System.out.println("kactane = " + kactane);
        
    }
}
