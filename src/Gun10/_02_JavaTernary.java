package Gun10;

import java.util.Scanner;

public class _02_JavaTernary {
    public static void main(String[] args) {
        //Girilen sayi 50 den buyukse 1 degilse 0 yazdirin.
        //Ternary operator ile yapiniz.

        Scanner giris= new Scanner(System.in);
        System.out.print("Sayi Giriniz= ");
        int sayi= giris.nextInt();
        int sonuc= sayi>50? 1 : 0;
        System.out.println("sonuc= " + sonuc);//sonucu daha sonra int olarak kullanmak icin bu yapilabilir.

        System.out.println((sayi>50? "1" : "0")); // ikinci yontem. sonuc degiskeni atamadan yapilabilir.

    }
}
