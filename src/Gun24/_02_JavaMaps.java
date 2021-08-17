package Gun24;


import java.util.HashMap;
import java.util.Map;

public class _02_JavaMaps {
    public static void main(String[] args) {
        Map<String, String > SemihKartvizit = new HashMap<>();
        SemihKartvizit.put("isim", "Semih Nerede");
        SemihKartvizit.put("email", "semih@hotmail.com");
        SemihKartvizit.put("adres", "Frankurt/Almanya");
        SemihKartvizit.put("telefon", "0532 111 0000");

        System.out.println("SemihKartvizit.get(\"isim\") = " + SemihKartvizit.get("isim"));
        System.out.println("SemihKartvizit.get(\"telefon\") = " + SemihKartvizit.get("email"));

        Map<String, String > ismailKartvizit=new HashMap<>();
        ismailKartvizit.put("isim", "ismail demir");
        ismailKartvizit.put("email", "ismail@gmail.com");
        ismailKartvizit.put("adres", "Riga/Letonya");
        ismailKartvizit.put("telefon", "+90 542 542 2121");

        System.out.println("ismailKartvizit.get(adres) = " + ismailKartvizit.get("adres"));
        System.out.println("ismailKartvizit.get(\"telefon\") = " + ismailKartvizit.get("telefon"));

        //Yukarida iki farkli isim icin kartvizit MAP tanimlandi. Asagida MAP icinde kartvizit MAPleri tanimlama

        Map<String, Map<String, String> > kartvizitler=new HashMap<>();

        kartvizitler.put("Semih", SemihKartvizit);//Semih isimli bir KEY olusturuldu ve ona SemihKartvizit Value
        //olarak atandi. boylece Semih Keyi su an icinde SemihKartvizitinden isim, email, tel hepsini tutuyor.

        kartvizitler.put("Ismail", ismailKartvizit);

        System.out.println("Semihin telefonu = " + kartvizitler.get("Semih").get("telefon"));
        //Semih isimli kartvizit bilgilerinden telefonu cagirdik.

        System.out.println("ismailin bilgileri = " + kartvizitler.get("Ismail"));
        //ismailin tum kartvizit bilgilerini yazdirir. Kartvizitler keyi icinden ismail value cagrildi.

        System.out.println("kartvizitler = " + kartvizitler);//kartvizitler icindeki tum isimlerin tum kartvizit
        //bilgileri yazdirir.



    }
}
