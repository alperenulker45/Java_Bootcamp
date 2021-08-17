package Gun15;

import java.util.Scanner;

public class _07_JavaArray {
    public static void main(String[] args) {
        //1-Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
        // Kelimelerden en uzun olanının ilk ve son harfini Büyük ise küçük
        // küçük ise büyük hale getiriniz.

        String[] dizi = new String[5];
        Scanner sc = new Scanner(System.in);
        int enb = 0;
        String enuzun = "";
        for (int i = 0; i < dizi.length; i++)
        {
            System.out.print((i + 1) + ". Texti Giriniz: ");
            dizi[i] = sc.nextLine();
            if (dizi[i].length() > enb)
            {
                enb = dizi[i].length();
                enuzun = dizi[i];
            }
        }
        char first=enuzun.charAt(0);
        char last=enuzun.charAt(enuzun.length()-1);

        if (Character.isUpperCase(first))
            first= Character.toUpperCase(first);
        else
            last= Character.toLowerCase(first);

        }
    }
