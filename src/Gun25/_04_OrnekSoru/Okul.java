package Gun25._04_OrnekSoru;


import java.util.ArrayList;
import java.util.Arrays;

public class Okul {
    // 1) create class student with fields: string name, int not
    // 2) Daha sonra 3 tane öğrenci ve notu oluşturun. ve bu öğrencileri bir ArrayList e ekleyin.
    // 3) Daha sonra öğrenci bilgilerin yazdıran bir metod yazarak , Arraylist teki öğrenci bilgilerini döngü yazdırınız.
    // 4) Daha sonra bütün öğrencilerin not ortalamasını bir metod aracılığı bularak main de yazdırınız.

    public static void main(String[] args) {
        //Sorunun 2. kismi
        student ogrenci1=new student();
        ogrenci1.name="Alperen";
        ogrenci1.not=100;

        student ogrenci2= new student();
        ogrenci2.name="Ahmet";
        ogrenci2.not=10;

        student ogrenci3= new student();
        ogrenci3.name="Ali";
        ogrenci3.not=70;

        ArrayList<student> ogrenciler =new ArrayList<>(Arrays.asList(ogrenci1, ogrenci2, ogrenci3));

        bilgiYazdirma(ogrenciler);
        ortalamabul(ogrenciler);

    }

    public static void bilgiYazdirma (ArrayList<student> ogrenciler) {
        for (student ogr : ogrenciler)
        {
            System.out.println("ogr.name + ogr.not = " + ogr.name +" " + ogr.not);
        }
    }

    public static void ortalamabul (ArrayList<student> ogrenciler) {
        int toplam=0;
        for (student ogr : ogrenciler) {
            toplam+=ogr.not;
        }
        int ortalama=toplam/ ogrenciler.size();
        System.out.println("ortalama = " + ortalama);
    }
}

class student {
    //Sorunun 1. kismi
    String name;
    int not;
}
