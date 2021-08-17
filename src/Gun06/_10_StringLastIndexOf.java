package Gun06;

public class _10_StringLastIndexOf {
    public static void main(String[] args) {
        //indexof la ayni sekilde calisir. ama aranan karaktere tersten bakar ve bulunca bastan
        // 0'dan baslayarak sonda buldugu karakterin indexini verir.

        String s1="Merhaba";
        System.out.println("Bastan a nin INDEXI = " + s1.indexOf("a"));//4 sonucunu verir. ilk a yi alir.
        System.out.println("Sondan a nin INDEXI= " + s1.lastIndexOf("a"));//6 verir. sondaki a yi alir.

        String s2="Good";
        System.out.println("bastan o nun INDEXI = " + s2.indexOf("o"));//1 sonucunu verir. ilk o
        System.out.println("sondan o nun INDEXI = " + s2.lastIndexOf("o"));//2 sonucunu verir. sondaki o






    }
}
