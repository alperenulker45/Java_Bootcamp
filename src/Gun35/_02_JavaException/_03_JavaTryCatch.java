package Gun35._02_JavaException;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program Basladi");

        try {//dene, hata ihtimali olan yerin ustune konur.

            System.out.println("Tarih Setleniyor");
            LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
            //Burada ayin gununu 40 girdigimiz icin DateTimeException verecek.
            //Ama ben hatadan sonra da programin devam etmesini, kirilmamasini
            // ve en son bana hatayi gostermesini istiyorum.
            //Bunun icin exception ihtimali olan yeri try-catch icine almam gerekiyor.
            System.out.println("Islem Tamam");//yukarda hata oldugu icin ve bu kodda try icinde

        } catch (Exception error)//burada parantez icine bir Exception degiskeni atamamiz gerekiyor.
        //hata isimli degiskenin icine olusan hatalarin bilgisi ekleniyor.
        {
            System.out.println(error.getMessage());//sadece error yazinca da yazdiriyor ama dogrusu bu
            //buraya kendimiz de bir mesaj girebiliriz.
            System.out.println("1-31 arasi rakam giriniz");
        }

        System.out.println("Programin bu bolumunde diger metodlar calisiyor");

        System.out.println("Program Sonu");


    }
}
