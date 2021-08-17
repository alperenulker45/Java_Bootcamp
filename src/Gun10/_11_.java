package Gun10;

import java.util.Scanner;

public class _11_ {
    public static void main(String[] args) {
       Scanner giris= new Scanner(System.in);
        System.out.println("1 int 2 byte giriniz");
        int int1= giris.nextInt();
        byte byt1= giris.nextByte();
        byte byt2= giris.nextByte();

        System.out.println(int1 - (byt1+byt2));

    }
}
