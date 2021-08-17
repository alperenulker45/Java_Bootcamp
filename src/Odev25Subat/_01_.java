package Odev25Subat;

import java.util.Scanner;

public class _01_ {
    public static void main(String[] args) {
        //1- Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
        // Kelimelerden en uzun olanının ilk ve son harfini Büyük ise küçük
        // küçük ise büyük hale getiriniz.

        Scanner sc=new Scanner(System.in);
        String [] dizi= new String[5];
        int longest=0;
        String uzun="";

        for (int i=0; i<dizi.length; i++)
        {
            System.out.println("kelime giriniz");
            dizi [i]= sc.nextLine();
            if (dizi[i].length()>longest)
            {
                longest=dizi[i].length();
                uzun=dizi[i];
            }

        }
        char first=uzun.charAt(0);//ilk harf
        char last=uzun.charAt(uzun.length()-1);//son harf

        if (Character.isUpperCase(first))
           first=Character.toLowerCase(first);
        else first=Character.toUpperCase(first);

        if (Character.isLowerCase(last))
            last=Character.toUpperCase(last);
        else last=Character.toLowerCase(last);

        System.out.print("En Uzun Kelima ilk ve son harf degismis= "+first+uzun.substring(1,uzun.length()-1)+last);
    }
}
