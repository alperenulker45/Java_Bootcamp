package Gun10;

import java.util.Scanner;

public class _10_JavaRandom {
    public static void main(String[] args) {
        //// Kullanıcıdan alt ve üst değeri  tek bir satırda arasında virgul olarak (önce min virgul
        //  sonra max değeri) alarak sayı üretiniz ve ekrana yazdırınız.
        //  34,56 şeklinde tek bir satırda girecek min ve max ı   5,75 seklinde

        Scanner read= new Scanner(System.in);
        System.out.print("Min ve Max Degerleri arasina virgul koyarak giriniz= ");
        String minMaxDeger= read.nextLine();
        int virgul= minMaxDeger.indexOf(",");
        String min= minMaxDeger.substring(0, virgul);
        String max= minMaxDeger.substring(virgul+1);
        int mindeger= Integer.parseInt(min);
        int maxdeger= Integer.parseInt(max);
        int random= (int) (((Math.random() * (maxdeger - mindeger)) + 1) + mindeger);
        Scanner giris= new Scanner(System.in);
        System.out.print("Sayi Tahmin Ediniz= ");
        int tahminisayi= giris.nextInt();
        System.out.println("random = " + random);
        System.out.println(tahminisayi==random? "Tebrikler" : "Bilemediniz");

    }
}
