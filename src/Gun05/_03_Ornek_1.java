package Gun05;

import java.util.Scanner;

public class _03_Ornek_1 {
    public static void main(String[] args) {
        //Girilen bir adi ekrana yazdiriniz

        Scanner oku= new Scanner(System.in);
        System.out.print("Adinizi Giriniz=");
        String ad= oku.next();// next kelime okumak icin. yani tek kelime okur. uzun string icin nextline
        System.out.println("Benim Adim = " + ad);
    }
}
