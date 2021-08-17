package Gun09;

import java.util.Scanner;

public class _06_Ornek5 {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner giris= new Scanner(System.in);
        System.out.print("Enter Your Password= ");
        String password= giris.nextLine();
        if (password.length()>=8 && !password.toLowerCase().contains("pass") && password.length()<=12) {
            System.out.println("Password Created");
        }

        else {System.out.println("Password must be between 8-12 characters and should not contain 'pass'");}


    }
}
