package Gun31.StaticModifier.Ornek2;

public class Student {

    int id;
    String ad;
    String soyad;

    static int sayac=0;//toplam nesne sayisi icin class icinde static bir sayac tanimlayarak her nesne tanimlamada
    //sayac++ yaparak nesneyi sayiyoruz.


    public Student(String ad, String soyad) {
        this.id = ++sayac;
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
