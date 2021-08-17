package Gun27_01_Ornek.Gun27_03_Ornek;

import java.util.ArrayList;
import java.util.Arrays;

public class Soru {
    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Ders sınınıfı ayrı dosyada : adı: Lesson , fields : name, credit (1-10 arasında değer alıyor)
    // 2- Öğrenci Sınıfı ayrı dosyada: adı: Student, fields : name, maxCredit, dersleri listesini
    // tutacak bir liste
    // 3- 3 adet ders oluşturunuz.
    // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
    // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
    //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
    //    uyarı versi, alabileceğiniz max credi doldu şeklinde.

    public static void main(String[] args) {

        Lesson mat101 = new Lesson();
        mat101.name = "Matematik";
        mat101.credit = 3;

        Lesson java101 = new Lesson();
        java101.name = "Java";
        java101.credit = 6;

        Lesson fiz101 = new Lesson();
        fiz101.name = "Fizik";
        fiz101.credit = 4;

        Student ogrenci1 = new Student();
        ogrenci1.name="Necdet";
        ogrenci1.maxcredit=10;
        ogrenci1.dersList=new ArrayList<>();

        ogrenci1.dersList.add(mat101);
        ogrenci1.dersList.add(java101);
        System.out.println("ogrenci1.totalCredit() = " + ogrenci1.totalCredit());//burda 9 kredimiz var.

        //bu ders max krediyi asti. bunu almamasi icin ne yapabiliriz?//bir metod actik studenta toplam kredi ve
        // gecip gecmeme durumunu inceleyen
        ogrenci1.addLesson(fiz101);
        System.out.println("ogrenci1.totalCredit() = " + ogrenci1.totalCredit());//burda 13 oldu ama eklememesi gerekir.




    }
}
