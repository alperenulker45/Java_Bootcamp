package Odev24Subat;

public class _01_Soru1 {
    public static void main(String[] args) {
        //1- Çarpım tablosunu 10 blok halinde alt alta değil,
        // ilk sıraya 5 blok ve sonra alt sıraya 5 blok şeklinde yazdırınız.

        for (int i=1; i <=5; i++)
        {
            for (int j=1; j<=5; j++)
            {
                System.out.print(j +"x"+ i + "=" + (i*j)+" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int k=6; k<=10; k++)
        {
            for (int l=6; l<=10; l++)
            {
                System.out.print(l +"x"+ k + "=" + (l*k)+" ");
            }
            System.out.println();
        }

    }
}
