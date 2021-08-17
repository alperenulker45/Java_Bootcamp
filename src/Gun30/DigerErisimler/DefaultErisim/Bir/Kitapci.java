package Gun30.DigerErisimler.DefaultErisim.Bir;

public class Kitapci {

    public static void main(String[] args) {

        Kitap eskikitap=new Kitap();//default olandan cagirdik cunku ayni pakette
        eskikitap.name="Yeni Java Kitabi";

        Kitap yenikitap=new Kitap("Java Kitabi");//public cagirdik ayni pakette olmasa da cagirirdik
    }
}
