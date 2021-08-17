package Gun26._01_Soru1_ClassOrnek;

public class Ornek1 {
    // 1.Adım  :Person isimli bir class yazınız:fields: name, surname, age; olsun.
    // 2.Adım  :main de 2 tane bu sınıftan nesne oluşturup değer atayınız.
    // 3.Adım  :getBirthYear isminde Person a ait bir metod yazınız, çalıştığında kişinin doğum yılını versin.
    // 4.Adım  :getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi şeklinde (Büyük harf) veren
    //          metodu yazınız. örnek ahmet demir : A.D.

    public static void main(String[] args) {

        Person first=new Person();
        first.name="Alperen";
        first.surname="Ulker";
        first.age=31;

        Person second=new Person();
        second.name="Ali";
        second.surname="Yilmaz";
        second.age=24;

        //1. yontem yazdirma
        System.out.println("first.name = " + first.name);//bu yontemde tek tek tum bilgileri yazmamiz lazim.
        System.out.println("first.surname = " + first.surname);
        System.out.println("first.age = " + first.age);


        //2.Yontem Yazdirma
        bilgiYazdir2(first);//bu clasin icine method acarak boylece kisinin tum bilgilerini yazdirdik.
        bilgiYazdir2(second);
        System.out.println();

        //3. Yontem Yazdirma
        first.bilgiYazdir();//person classi icine bilgi yazdirma metodu acarak bu sekilde yazdirdik.
        System.out.println();
        second.bilgiYazdir();//en kullanisli yontem bu. diger clasta method aciyorz ve bu ana class sade kaliyor.

        System.out.println();

        first.getBirthYear();//person clasina istedigimiz ozellikte bir method acarak first olarak tanimladigimiz
        second.getBirthYear();//degisken icin o methodu bir ozellik gbi cagiriyoruz.

        System.out.println();

        first.getInitials();//ad ve soyadin ilk harflerini yazdiran komutu.
        second.getInitials();

    }
    public static void bilgiYazdir2(Person kisi) {
        System.out.println("kisi.name = " + kisi.name);
        System.out.println("kisi.surname = " + kisi.surname);
        System.out.println("kisi.age = " + kisi.age);
    }

}
