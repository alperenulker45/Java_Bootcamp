package Gun08;

import java.util.Scanner;

public class _07_IfOrnek2 {
    public static void main(String[] args) {
        //Girilen bir sayinin negatif mi pozitif mi oldugunu yazdiriniz. Sifirsa sifir yazdiriniz.

        Scanner input= new Scanner(System.in);
        System.out.print("Enter number= ");
        int number= input.nextInt();

        if (number==0) {
            System.out.println("zero");
        }

        if (number>0) {
            System.out.println("positive");
        }

        if (number<0) {
            System.out.println("negative");

        }
    }
}
