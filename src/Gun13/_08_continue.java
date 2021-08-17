package Gun13;

import java.util.Scanner;

public class _08_continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner sc=new Scanner(System.in);
        System.out.print("Cumle Giriniz: ");
        String str= sc.nextLine();

        for (int i=0; i<str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            continue; //continue calistigi anda devam eden satirlar pas gecilir ve sonraki adimdan devam edilir.

            System.out.println(str.charAt(i));
        }
    }
}
