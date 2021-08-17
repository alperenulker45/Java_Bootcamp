package Gun30.DigerErisimler.DefaultErisim.Iki;

import Gun30.DigerErisimler.DefaultErisim.Bir.Kitap;

public class AmazonStore {
    public static void main(String[] args) {
        //baska pakette ve defaul oldugundan Kitap()'a erisim saglayamiyoruz.
        //Kitap eskiKitap=new Kitap();
        //eskiKitap.name="yeni Java Kitabi";

        Kitap yeniKitap=new Kitap("Java Kitabi");
    }
}
