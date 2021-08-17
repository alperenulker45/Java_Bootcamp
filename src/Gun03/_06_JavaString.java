package Gun03;

public class _06_JavaString {
    public static void main(String[] args) {
        int sayi = 5; //bunu ilk harfi kucuk olarak tanimlayabiliyoruz. Ama stringde olmuyor

        String ad = "ismet"; //string ifadelerin sayi gibi siniri belli olmadigindan cift tirnak arasina koymak zorunlu
        String soyad = "temur";

        System.out.println(ad); //ekrana ismet yazdirir
        System.out.println("ad"); //ekrana ad yazdirir

        // cift tirnak arasina yazilmayan hersey degisken olarak kabul edilir

        String ajan = "007JamesBond";
        System.out.println("ajan=" + ajan);

        String fullName = ad + soyad;
        System.out.println(fullName + ajan);
        System.out.println(ad+" "+soyad);//isim ve soyismi ayirmak icin ortada tirnak arasinda bir bosluk biraktik

        int yas=45;
        int kilo=72;
        String bilgi=ad+" "+soyad+ " "+yas+ " "+kilo;
        String bilgi2= ad + soyad + (yas+kilo); //bu sekilde yaparsak yas ve kiloya toplama islemi yapar
        System.out.println("bilgi="+ bilgi); // ismet temur 45 seklinde yazdirir
        //toplama isleminde bir tane bile string varsa hepsi string kabul edilir, sadece islemde

        System.out.println(ad+" "+soyad+" "+ "yas="+yas +" "+ "kilo="+kilo);

        String Sonbilgi= ad+soyad+" "+"yas="+yas;
        Sonbilgi=ad+soyad+" "+"yas="+yas+ " "+"kilo"+kilo;
        //bir kez degisken (string veya digerleri) ayni degiskeni tekrar tanimlayabiliriz. Prog. son tanimlamani alir

        System.out.println(Sonbilgi);




    }
}
