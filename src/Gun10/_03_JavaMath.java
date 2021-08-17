package Gun10;

public class _03_JavaMath {
    public static void main(String[] args) {
        int a=-12;
        int b= 4;
        System.out.println("a nin mutlak degeri = " + Math.abs(a));
        System.out.println("a ve b den buyuk olani = " + Math.max(a, b));
        System.out.println("a ve b den kucuk olani = " + Math.min(a, b));
        System.out.println("b nin karekoku = " + Math.sqrt(b));//karekok alma

        // 3 sayidan en buyuk olani yazdirma//
        System.out.println("2, 6 ve 8 den en buyuk = " + Math.max(2, Math.max(6, 8)));
        //bu sekilde ic ice uzatilabilir.

        System.out.println("2 nin 3. kuvveti" + Math.pow(2, 3)); //sayinin ussunu alma
        System.out.println("round 3.1" + Math.round(3.1)); // yakin olan tam sayiya yuvarlar
        System.out.println("round 3.5" + Math.round(3.5));
        System.out.println("ceil 3.1" + Math.ceil(3.1)); // ceil=tavan..yukariya tamamlar. sonuc=4
        System.out.println("ceil 3.5" + Math.ceil(3.5)); // 4
        System.out.println("floor 3.1" + Math.floor(3.1)); // floor=taban..asagiya tamamlar. sonuc=3
        System.out.println("floor 3.5" + Math.floor(3.5)); // floor=taban..asagiya tamamlar. sonuc=4

    }
}
