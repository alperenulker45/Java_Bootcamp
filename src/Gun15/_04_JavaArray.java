package Gun15;

import java.util.Arrays;
import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 5 elemanlı int bir dizi tanımlayınız.Kullanıcıdan değerleri alarak
        // bu diziyi doldurunuz.Daha sonra ortalamadan büyük eleman sayısını bulunuz.

        int[] dizi=new int[5];
        Scanner sc=new Scanner(System.in);
        int i=dizi.length;
        int toplam=0;
        for (i=0; i< dizi.length; i++)
        {
            System.out.print((i+1) + ". Sayi: ");
            dizi[i] = sc.nextInt();
            toplam=toplam+dizi[i];

        }

        int ort=toplam/dizi.length;
        int ortGecenElemanSay=0;

        for(i=0;i<dizi.length ;i++)
        {
            if (dizi[i] > ort)
                ortGecenElemanSay++;
        }

        System.out.println("ortGecenElemanSayisi = " + ortGecenElemanSay);



    }
}
