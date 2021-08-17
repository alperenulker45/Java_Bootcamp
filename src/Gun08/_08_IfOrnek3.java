package Gun08;

import java.util.Scanner;

public class _08_IfOrnek3 {
    public static void main(String[] args) {
        //Girilen iki sayidan buyuk olanini ekrana yazdiriniz. Esitse esit yazdiriniz.

        Scanner input= new Scanner(System.in);
        System.out.print("Sayi Giriniz");
        int number1= input.nextInt();
        System.out.print("Sayi Giriniz");
        int number2= input.nextInt();

        if (number1==number2){
            System.out.println("equal");
        }

        if (number1>number2){
            System.out.println("buyuk sayi="+number1);
        }

        if (number2>number1){
            System.out.println("buyuk sayi="+number2);
        }
    }
}
