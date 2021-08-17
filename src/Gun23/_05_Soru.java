package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        //AddElements şeklinde bir metodla 1 veya 1 den fazla sayı eklenebilen metodu
        // yazınız.

        HashSet<Integer>hs= new HashSet<>();
        AddElements(hs, 12,14);
        AddElements(hs, 1,2,3,4,5,101,102,103);
        AddElements(hs,65);

        System.out.println("hs " + hs);
    }
    // Dizi tipindeki dizi, arraylist, set ler i fonktsiyona gönderdiğinizde
    // fonksiyona kendisi gittiği için yapılan değişiklikler kendisinde yapıldığı için
    // bu değişkenleri RETURN etmenize gerek yoktur.

    public static void AddElements (HashSet<Integer> hs, Integer... sayilar)
    {
        //1. yontem
        hs.addAll(Arrays.asList(sayilar));

        //2. yontem

        for (int i = 0; i <sayilar.length ; i++)
        {
         hs.add(sayilar[i]);
        }

    }

}
