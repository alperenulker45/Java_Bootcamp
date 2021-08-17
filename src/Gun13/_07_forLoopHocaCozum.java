package Gun13;

import java.util.Locale;
import java.util.Scanner;

public class _07_forLoopHocaCozum {
    public static void main(String[] args) {
        // Girilen bir stringdeki a harfi sayısını bulunuz.
        // c harfine sıra gelirse döngüden çıkılsın

        Scanner sc=new Scanner(System.in);
        System.out.print("Cumle Giriniz: ");
        String str= sc.nextLine();
        int aharfi=0;

        for (int i=0; i<str.length(); i++)
        {
            if (str.toLowerCase().charAt(i)=='a')
                aharfi++;
            else if (str.toLowerCase().charAt(i)=='c')
                break;
        }

        System.out.println("a harfi sayisi = " + aharfi);
    }

}
