package Gun25._03_Ornek;

public class Kampus {
    public static void main(String[] args) {
        //okul ve ogrenci siniflari olan bir yapi tasarlayiniz.

        Ogrenci ogrenci1=new Ogrenci();
        ogrenci1.number=1;
        ogrenci1.name="Mesut";
        ogrenci1.surName="Demir";

        Ogrenci ogrenci2=new Ogrenci();
        ogrenci2.number=2;
        ogrenci2.name="Gulcan";
        ogrenci2.surName="Bayrak";

        Okul okul1=new Okul();
        okul1.adi="Cumhuriyet";
        okul1.adresi="Merkez Mahallesi";
        okul1.muduru="Ragip Bey";
        okul1.ucreti=20000;

        System.out.println("ogrenci1.number = " + ogrenci1.number);
        System.out.println("ogrenci2.surName = " + ogrenci2.surName);
        System.out.println("okul1.adresi = " + okul1.adresi);
        System.out.println("okul1.muduru = " + okul1.muduru);
        System.out.println(okul1.muduru.toUpperCase());
        System.out.println(ogrenci2.surName.substring(0, 3));

        ogrenci1.okulu = okul1;//ogrenci classina ozellik olarak okul (okul classindan) tanimladik.
        System.out.println("ogrenci1.okulu.adi = " + ogrenci1.okulu.adi);

        ogrenci2.okulu= new Okul();
        ogrenci2.okulu.adi="29 Ekim";
        ogrenci2.okulu.muduru="Alp";
        ogrenci2.okulu.ucreti=30000;

        System.out.println("ogrenci2.okulu.adi = " + ogrenci2.okulu.adi);
        System.out.println("ogrenci2.okulu.muduru = " + ogrenci2.okulu.muduru);


    }
}
