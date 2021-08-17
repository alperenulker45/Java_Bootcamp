package Gun30.DigerErisimler.PrivateErisim;

public class Calisan {

    int id;
    String name;
    String surName;
    private String password;

    public void sifreBelirle(String sifre) {
        if (sifre.length()>=8)
            this.password=sifre;

        else System.out.println("Sifre en az 8 karakter olmali");//sifre icin belli sartlar koyduk.
    }

    public void sifreGoster() {
        System.out.println("****" + this.password.substring(4));//sifre gormek istenildiginde son 4 karakteri
        //gosterip oncesine yildiz koyduk.
    }
}
