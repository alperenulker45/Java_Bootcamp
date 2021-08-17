package Gun36;

public class _05_JavaCheckedException {

    public static void main(String[] args) {

        //hata olsa bile try catch zorunlu tutulmuyorsa
        //bunlara unchecked exception deniyor.

        int a=5;
        int b=0;

        System.out.println("a/b = " + a/b);

        //bu sonucta aslinda runtime exception var. ama calistirmaya izin veriyor. zorunlu olarak
        //try catch istemiyor (kirmizi uyari yok. compile error olarak gormuyor)
    }

}
