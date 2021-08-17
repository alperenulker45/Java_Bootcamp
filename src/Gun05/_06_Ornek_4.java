package Gun05;

import java.util.Scanner;

public class _06_Ornek_4 {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz iki tam sayinin toplamini ekrana yazdiriniz.

        Scanner imput = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz="); int number1 = imput.nextInt();

        System.out.print("Tekrar Sayi Giriniz=");  int number2 = imput.nextInt();

        int total = number1 + number2;

        System.out.println("toplam = " + total);

        // ya da

        System.out.println("toplam=" + (number1+number2));

    }
}
