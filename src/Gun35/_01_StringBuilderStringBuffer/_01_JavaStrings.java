package Gun35._01_StringBuilderStringBuffer;

import java.util.Arrays;

public class _01_JavaStrings {
    public static void main(String[] args) {
        String cumle="";

        //String degiskeni cok fazla ekleme veya islemler icin performansi oldukca dusuk;

        cumle+="Bugun";
        cumle+="hava";
        cumle+="sicak";

        cumle = cumle.concat("yeni kelime");//atama yapmak gerekir. StringBuilder'da buna gerek yoktur.
        System.out.println("cumle = " + cumle);

        //Eger cok fazla String islemi yapilacaksa bunun icin performansi oldukhca hizli olan
        //StringBuilder kullanilir. Yapisi geregi hizli calisir. Fakat paralel calisan uygulamalarda
        //guvenilir degildir. O zaman StringBuffer kullanilir.

        StringBuilder s = new StringBuilder();

        s.append("Bu");//bu komutla Stringe ekleme yapilir.
        s.append("gun");
        s.append("hava");
        s.append("sicak");

        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());//Stringin uzunlugunu verir.

        s.append(3);//eklenenleri Stringe cevirip ekler.
        System.out.println("s = " + s);
        System.out.println("s.reverse() = " + s.reverse());//Stringi ters cevirir.
        s.reverse();

        s.delete(0, 5);//girilen indexlerin arasini siler. ilk index dahil son index dahil degil.
        System.out.println("s = " + s);

        s.deleteCharAt(3);//3 uncu indexteki karakteri siler.
        System.out.println("s = " + s);

        System.out.println("s.indexOf(\"a\") = " + s.indexOf("a"));//verilen karakterin indexini bulur.

        s.insert(4, 23);//4 uncu indexten sonra araya 23 ekledi. insert komutu.
        System.out.println("s = " + s);

        s.insert(5, 2.34);//double ekledik ama onu da Stringe cevirip ekler.
        System.out.println("s = " + s);

        int[] dizi = {1,4,5,6,7};

        s.insert(4, Arrays.toString(dizi));//dizi ekleme de yapilabiliyor.
        System.out.println("s = " + s);

        s = new StringBuilder("Bugun hava guzel");//clear koumutu yok. bu sekilde StringBuilder s'i tamamen silebilir
        //ya da degistirebiliriz.

        String ss = String.valueOf(s);//StringBuilderi normal Stringe cevirdik.

        s.replace(3, 8, "bu");
        //baslangic ve son verilen bolume verilen Stringi atar.
        //Eger verilen buyuk ise aradaki bolum delete olur. ust sinir haric.

        System.out.println("s = " + s);


    }
}
