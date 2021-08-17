package Gun19;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci Sayi Giriniz: ");
        int sayi1= sc.nextInt();
        System.out.print("Ikinci Sayi Giriniz: ");
        int sayi2= sc.nextInt();
        int enb= buyukbul(sayi1, sayi2);
        System.out.println("buyuksayi = " + enb);

    }

    public static int buyukbul(int a, int b)
    {
        if (a>b)
            return a;
        else return b;
    }
}
