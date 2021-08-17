package Gun06;

public class _05_StringContains {
    public static void main(String[] args) {
        //bir stringin icinde karakter var olup olmadigini kontrol eder.
        //var ise boolean cinsinden true dondurur. Yoksa false dondurur.

        String str="Merhaba Dunya";

        boolean is= str.contains("a");
        System.out.println("is = " + is);//var ise true sonuc verir..

        System.out.println("Var mi (ya)= " + str.contains("ya"));
        System.out.println("Var mi (aba) = " + str.contains("aba"));
        System.out.println("Var mi (f) = " + str.contains("f"));
        System.out.println("Var mi (A) = " + str.contains("A"));

    }
}
