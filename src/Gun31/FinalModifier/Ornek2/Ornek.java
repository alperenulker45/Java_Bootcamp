package Gun31.FinalModifier.Ornek2;

public class Ornek {

    // Person isimli bir Class tanımlayınız (fields: isim, tcNo)
    // tcNo değerini int olarak alınız ve nesne oluşturulurken
    // sıralı olarak atayınız.Daha sonradan değeri değiştirilemesin.
    // kontrol için mainde 2 kişi tanımlayınız.

    public static void main(String[] args) {
        
        Person kisi1= new Person("Ali");
        Person kisi2= new Person("Veli");
        Person kisi3= new Person("Deli");

        System.out.println("kisi1 = " + kisi1);
        System.out.println("kisi2 = " + kisi2);
        System.out.println("kisi3 = " + kisi3);

        System.out.println("Person.sayac = " + Person.sayac);
    }

}
