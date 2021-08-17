package Gun25;


import java.util.Scanner;

public class _01_JavaClassAndObject {
    public static void main(String[] args) {
        //burasi main method ve burada ana islemleri yapiyoruz.

        int sayi; // int tipinde bir degisken tanimlandi.
        Scanner sc=new Scanner(System.in);

        //1. yontem nesne olusturma.. asamali.
        Araba yourCar;//burada araba siparisi verdik.
        yourCar= new Araba();//artik uretildi.

        //2. yontem nesne olusturma.. tek islemde.
        Araba myCar= new Araba();//artik kullanilabilir halde.
        //baslangic degerleri ile bir araba uretilmis oldu.

        myCar.renk="Kirmizi";
        myCar.yil=2021;
        myCar.motorHacmi=1600;

        yourCar.renk="Siyah";
        yourCar.yil=2020;
        yourCar.motorHacmi=2000;

        System.out.println("My Car Renk =" + myCar.renk);
        System.out.println("myCar.yil = " + myCar.yil);
        System.out.println("myCar.motorHacmi = " + myCar.motorHacmi);

        System.out.println("yourCar.renk = " + yourCar.renk);



    }

    //burada methodlar yapiliyor.
}

//burada class tanimlanacak.
//1. Yontem Class tanimlama.
class Araba {//bu tasarima class diyoruz ve bu sekilde tanimlaniyor.

    //Ozellikleri ve metdolari yazilir.
    String renk;
    int yil;
    double motorHacmi;
}
