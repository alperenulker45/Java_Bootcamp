package Gun05;

import java.util.Scanner;

public class _02_JavaScanner {
    public static void main(String[] args) {

        Scanner oku= new Scanner(System.in);
        // oku degiskenine bir okuyucu tanimlandi. (System.In)--> klavyeden giris yapmak uzere.

        System.out.print("Bir Sayi Giriniz=");
        int sayi= oku.nextInt();

        System.out.println("Girilen Sayi = " + sayi);
    }
}
