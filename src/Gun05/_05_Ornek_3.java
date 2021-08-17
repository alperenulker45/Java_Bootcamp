package Gun05;

import java.util.Scanner;

public class _05_Ornek_3 {
    public static void main(String[] args) {
        //Kullanicidan ad ve soyadini ayri ayri isteyerek ekrana yazdiriniz.

        Scanner imput = new Scanner(System.in);

        System.out.print("Adinizi Giriniz=");
        String name= imput.nextLine();

        System.out.print("Soyadinizi Giriniz=");
        String surName= imput.nextLine();

        System.out.println("Ad ve Soyad =" + name + " " + surName);
    }
}
