package Gun09;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //Girilen bir ogrencinin notu 50'den buyuk esit ise gecti, dusuk ise kaldi yaziniz.

        Scanner giris= new Scanner(System.in);
        System.out.print("Not Giriniz = ");
        int ogrNot= giris.nextInt();

        if (ogrNot>=50)
        {
            System.out.println("Gectiniz, Tebrikler");
        }
        else

            {
                System.out.println("Kaldiniz");
            }
        // eger if, else kalibi olmasaydi bu islemi iki if kosulu kullanarak yapardik. bu sekilde hem kolaylik
        //sagladik hem de ilk if kosulu saglandiginda tekrar else inmemesini sagladik. iki if kosulunda her ikisini de
        // kontrol ederdi.
    }
}
