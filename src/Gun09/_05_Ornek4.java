package Gun09;

import java.util.Scanner;

public class _05_Ornek4 {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        //  hayır yazdırınız.soruyu buyuk kucuk harf farki olsa da calisacak sekilde yapiniz
        Scanner giris= new Scanner(System.in);
        System.out.print("String Giriniz= ");
        String text= giris.nextLine();
        if (text.length()>10 && text.toLowerCase().contains("study")) {
            System.out.println("Evet");
        }
        else {
            System.out.print("Hayir");
        }
    }
}
