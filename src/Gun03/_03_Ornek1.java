package Gun03;

public class _03_Ornek1 {
    public static void main(String[] args) {

        // Bir dikdortgenin kisa ve uzun kenari icin 2 degisken tanimlayiniz
        // 10 ve 15 degerlerini atayiniz. Alan ve cevre hesaplayiniz.
        // kodlar araliksiz yazildiginda ctrl+alt+L basildiginda aralarina bosluk koyup duzenler
        Integer kisa = 10;
        Integer uzun = 15;
        Integer cevre = kisa + uzun + kisa + uzun;
        Integer alan = kisa * uzun;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre + "'dir");


    }
}
