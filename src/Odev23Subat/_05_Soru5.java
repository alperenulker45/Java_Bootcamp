package Odev23Subat;

public class _05_Soru5 {
    public static void main(String[] args) {
        //5- 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.

        System.out.println("0-100 Arasi 5 ve 4'e Tam Bolunebilen Sayilar");
        for (int i=0; i<=100; i++ )
        {
            if (i%5==0 && i%4==0)
                System.out.println(i);
        }
    }
}
