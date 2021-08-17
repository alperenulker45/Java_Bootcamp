package Gun18;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {

        tekmiciftmi(3);
        tekmiciftmi(6);
        tekmiciftmi(8949);

        Scanner sc=new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int girilensayi= sc.nextInt();
        tekmiciftmi(girilensayi);

        topla(5,8);

    }

    public static void tekmiciftmi(int sayi)
    {
        if (sayi%2==1)
            System.out.println("tek");
        else
            System.out.println("cift");
    }

    public static void topla(int sayi1, int sayi2)
    {
        System.out.println("toplam= " + (sayi1+sayi2));
    }
}
