package Gun37.Ornekler.Ornek1;

public class KisiMain {
    public static void main(String[] args) {

        Kisi necdetKisisi = new Kisi();

        necdetKisisi.ad = "Necdet";
        necdetKisisi.soyad = "Demir";
       // necdetKisisi.yas = -25; //necdet kisisinin yasini yanlislikla -25 girdik. Bunu engellemek icin
                                // fieldlari private yapip kullanicilarin direk field girmesi engellenir.
                                //fielda ozellik girme sadece metodla belli sartlarda yapilir hale getirilir.
                                //Buna encapsulation denir.

        System.out.println(necdetKisisi);

        necdetKisisi.setYas(-25);
        System.out.println(necdetKisisi.getYas());


    }
}
