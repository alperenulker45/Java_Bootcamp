package Odev25Subat;

import java.util.Arrays;

public class _05_ {
    public static void main(String[] args) {
        //5-Bu String'i oluşturun. "Removes white space from both ends of a string"
        //String'deki kelime sayısını yazdırınız.

        String sentence= "Removes white space from both ends of a string";
        String [] words= sentence.split(" ");
        System.out.println("Arrays.toString(words) = " + Arrays.toString(words));
        int kelimesayisi= words.length;
        System.out.println("kelime sayisi = " + kelimesayisi);
        
        
    }
}
