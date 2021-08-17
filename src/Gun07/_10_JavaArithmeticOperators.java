package Gun07;

public class _10_JavaArithmeticOperators {
    public static void main(String[] args) {
        //carpma, bolme, mod alma

        int a = 10;
        int b = 5;

        System.out.println("Carpma Islemi = " + (a*b));

        System.out.println("Bolme Islemi = " + (a/b));

        System.out.println("Modul Islemi");
        System.out.println("a%b=" + (a%b)); //10 mod 5 tam bolundugu icin 0 sonucunu verir.
        System.out.println("b%10=" + (b%a)); // 5 mod 10, soldaki kucuk oldugu icin kendini, yani 5 sonucu verir.




    }

}
