package Gun10;

import java.util.Scanner;

public class _01_JavaTernary {
    public static void main(String[] args) {

        // Kullanıcının gireceği sayı çift ise bir stringe "çift" atayınız,
        // tek ise "tek" atayınız ve ekrana stringi yazdırınız.

        Scanner giris= new Scanner(System.in);
        System.out.print("Sayi Giriniz= ");
        int sayi= giris.nextInt();

        String text="";

        if (sayi%2==0)
            text="Cift";
        else
            text="Tek";

        //2. Yontem Ternary Operator ile cozum

        text= (sayi%2==0)? "cift" : "tek";

        //Ternary Operator ile direk yazdirma 3. yontem

        System.out.println("text= " + ((sayi%2==0)? "cift" : "tek" ));

    }
}
