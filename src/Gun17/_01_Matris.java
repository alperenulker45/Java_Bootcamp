package Gun17;

public class _01_Matris {
    public static void main(String[] args) {
        int sayi=0; //hafizada bir sayilik yer ayiriyor ve adina sayi diyor
        int [] dizi= new int [5]; //hafizada 5 sayilik int yeri ayiriyor.
        int [][] tablo= new int[4][5];//hafizada 4 satir 5 sutunluk yani 20 int sayilik yer ayirir.

        //tablonun 1. satirina deger atamak icin.

        tablo [0][0] = 65;
        tablo [0][1] = 85;
        tablo [0][2] = 7;
        tablo [0][3] = 5;
        tablo [0][4] = 77;

        //tablonun 2. satirina deger atamak icin.

        tablo [1][0] = 6;
        tablo [1][1] = 8;
        tablo [1][2] = 76;
        tablo [1][3] = 56;
        tablo [1][4] = 7;

        // iki boyutlu arraylerde islem yapmak icin. diziye deger atamak, diziyi yazdirmak vb icin
        // ic ice iki for (nested for) kullanmamiz gerekiyor.

        for (int satir = 0; satir < 4; satir++)
        {
            for (int sutun = 0; sutun < 5; sutun++)
            {
                tablo[satir][sutun]= (int) (Math.random()*100);//tabloya 0-100 arasi random sayi atadik.
            }
        }

        for (int satir = 0; satir < 4; satir++)
        {
            for (int sutun = 0; sutun < 5; sutun++)
            {
                System.out.print(tablo [satir][sutun]+ " ");
            }

            System.out.println();
        }
    }
}
