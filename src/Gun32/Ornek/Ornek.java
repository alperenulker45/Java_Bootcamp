package Gun32.Ornek;

public class Ornek {
    //// Bir User yetkilendirme modülü yapılması isteniyor.
    //    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    //    // USER STATUSU : AKTIF, PASIF
    //    // Yukarıdaki şekilde bir USER class ı tanımlayınız
    //    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    //    // kullanıcısı tanımlayınız.ADMIN yetkili kullanıcıya
    //    // SILME işlemi kontrolü yapınız bir metod için.

    public static void main(String[] args) {
        User mudur = new User("Alperen", Role.MUDUR, Status.AKTIF);
        User personel= new User("Ali", Role.PERSONEL, Status.AKTIF);
        User satis= new User("Mehmet", Role.SATIS, Status.PASIF);

        if (personel.role == Role.ADMIN) {
            System.out.println("Mudur Silme");
        }

        System.out.println("mudur = " + mudur);
        System.out.println("personel = " + personel);
        System.out.println("satis = " + satis);

    }
}
