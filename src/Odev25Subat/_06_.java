package Odev25Subat;

import java.util.Arrays;

public class _06_ {
    public static void main(String[] args) {
        //Bir String oluşturun : "Hello World"
        //Stringi tersten yazdırın ve print edin.
        //Cevap böyle olmalı :  "dlroW olleH"

        String sentence="Hello World";
        String reverse="";

        for (int i=sentence.length()-1; i>=0; i--)
        {
            reverse+=sentence.charAt(i);
        }

        System.out.println("reverse = " + reverse);
    }
}
