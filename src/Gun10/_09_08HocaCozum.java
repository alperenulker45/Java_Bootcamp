package Gun10;

import java.util.Scanner;

public class _09_08HocaCozum {
    public static void main(String[] args) {
        // Kullanıcıdan alt ve üst değeri isteyerek random sayı üretiniz
        // ve üretilen sayıyı ekrana yazdırınız.
        // (int) (Math.random() * ((max - min) + 1)) + min;

        Scanner oku = new Scanner(System.in);
        System.out.print("Min=");
        int min = oku.nextInt();

        System.out.print("Max=");
        int max = oku.nextInt();

        int numberInRange = (int) (Math.random() * ((max - min) + 1)) + min;

        // 3 ile 7 arası üretmek istersek
        // min e bakalım ->  0*(...) + min => 3
        // max a bakalım ->  (0,99 * (5)) +min => 4+3 => 7

        System.out.println("numberInRange = " + numberInRange);
    }
}
