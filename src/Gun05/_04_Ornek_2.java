package Gun05;

import java.util.Scanner;

public class _04_Ornek_2 {
    public static void main(String[] args) {
        //Kullanicidan ad ve soyad alarak ekrana yazdiriniz.
        Scanner imput = new Scanner(System.in);
        System.out.print("Ad ve Soyadinizi Giriniz=");
        String ads= imput.nextLine();
        System.out.println("Adiniz ve Soyadiniz = " + ads);
    }
}
