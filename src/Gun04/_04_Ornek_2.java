package Gun04;

public class _04_Ornek_2 {
    public static void main(String[] args) {
        // 1 tane double 1 tane short degisken tanimlayiniz
        // double degiskeni short degiskene ceviriniz
        // tum degerleri ekrana yazdiriniz

        double deger= 4.12;
        short sDeger= 2;

        sDeger= (short) deger;

        System.out.println(sDeger); //2 olarak yazdirir
        System.out.println(deger); // 2.0 olarak yazdirir
    }
}
