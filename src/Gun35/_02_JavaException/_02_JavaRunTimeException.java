package Gun35._02_JavaException;

import java.util.Scanner;

public class _02_JavaRunTimeException {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz: ");
        int a= sc.nextInt();

        System.out.print("2. Sayiyi Giriniz: ");
        int b= sc.nextInt();

        System.out.println("a/b = " + a / b);//bolme isleminde kullanici b'yi 0 girerse arithmeticexception cikar.

        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at Gun35._02_JavaException._02_JavaRunTimeException.main(_02_JavaRunTimeException.java:16)


    }
}
