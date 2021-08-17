package Gun12;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int sayi;

        // normal while dan farkı döngüye mutlaka 1 kez girer, şart sonra kontrol edilir.
        // şart sağlanıyorsa döngü devam eder.
        do{
            System.out.print("Sayı giriniz = ");
            sayi = oku.nextInt();
        }while (sayi!=0);   // do_while döngüsü
    }
}
