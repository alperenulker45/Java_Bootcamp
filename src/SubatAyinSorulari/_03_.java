package SubatAyinSorulari;

import java.util.Scanner;

public class _03_ {
    public static void main(String[] args) {
        //3- Girilen bir sayının tersiyle aynı olup olmadığını bulunuz.

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        int originalnumber= sc.nextInt();
        int number=originalnumber;
        int reverse=0;

        while (number%10>0)
        {
            reverse=(reverse*10)+(number%10);
            number=number/10;
        }
        System.out.println("originalnumber = " + originalnumber);
        System.out.println("reverse = " + reverse);

        if (reverse==originalnumber)
            System.out.println("Original Number and The Reverse are equals");

        else System.out.println("Original Number and The Reverse are not equals");

    }
}
