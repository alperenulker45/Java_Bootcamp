package Gun06;

public class _08_StringIndexOf {
    public static void main(String[] args) {
        //verilen karakter(lerin) index icindeki nosunu verir.
        //contains bize var veya yok diyordu. bu ise indexini verir. yok ise -1 verir.
        //ayni karakterden iki tane varsa ilk karakterin indexini verir.

        String s1= "Merhaba Dunya";
        System.out.println("s1.indexOf(e) = " + s1.indexOf("e"));
        System.out.println("s1.indexOf(ha) = " + s1.indexOf("ha"));
        System.out.println("s1.indexOf() = " + s1.indexOf(" "));
        System.out.println("s1.indexOf(A) = " + s1.indexOf("A"));

    }
}
