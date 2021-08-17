package Gun09;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {
        //// Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        //        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        //        // hayır yazdırınız.

        Scanner giris= new Scanner(System.in);
        System.out.print("String Giriniz= ");
        String text= giris.nextLine();
        if (text.length()>10 && text.contains("study")) {
            System.out.print("Evet");
        }
        else {
            System.out.print("Hayir");
        }
    }
}
