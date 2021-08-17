package Gun06;

public class _11_StringSubString {
    public static void main(String[] args) {
        // Stringin belli bir bolumunu alma islemidir.
        String s1="Merhaba arkadaslar";

        System.out.println("1. bolum rhab = " + s1.substring(2, 6));
        //Index numaralarini giriyoruz. ilk verilen index dahil son degil. yani 2 nolu indexi alir, 6 yi almaz
        // 2, 6 girildiginde en son 5. indexi alir.
        // yani alt sinir dahil, ust sinir dahil degil.

        System.out.println("2. bolum arkadas = " + s1.substring(8, 15)); // arkadas

        System.out.println("3.bolum arkadaslar = " + s1.substring(8));//verilen indexten sona kadar


    }
}
