package Gun06;

import java.util.Scanner;

public class _03_Ornek1 {
    public static void main(String[] args) {
        //Girilen bir stringin sadece son harfini yazdiriniz.

        Scanner input= new Scanner(System.in);
        System.out.print("Bir string giriniz");
        String girilen= input.nextLine();

        //uzunluk icin = girilen.length(); yapiyoruz.
        // son karakteri bulmak icinse -1 geri gidiyoruz. index 0 dan basladigi icin.

        int uzunluk= girilen.length();
        char sonHarf= girilen.charAt(uzunluk-1);
        System.out.println("sonHarf = " + sonHarf);

    }
}
