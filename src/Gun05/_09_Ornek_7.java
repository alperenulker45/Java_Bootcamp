package Gun05;

import java.util.Scanner;

public class _09_Ornek_7 {
    public static void main(String[] args) {
        //Kullanicidan cadde, sokak, posta kodu (int) ve ulke seklinde
        //adres bilgisi yazdiriniz.

        Scanner input= new Scanner(System.in);
        System.out.print("Cadde ismi giriniz=");
        String cadde= input.nextLine();

        System.out.print("Sokak ismi giriniz=");
        String sokak= input.nextLine();

        Scanner input2= new Scanner(System.in);
        System.out.print("Posta kodu giriniz=");
        int postaKodu= input2.nextInt();

        System.out.print("Ulke giriniz=");
        String ulke= input.nextLine();

        System.out.println(cadde + " caddesi" + " " + sokak + " sokagi" + " " + "Posta Kodu" + postaKodu + ulke);
    }
}
