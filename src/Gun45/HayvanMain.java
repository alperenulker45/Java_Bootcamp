package Gun45;

import java.time.LocalDate;

public class HayvanMain {
    public static void main(String[] args) {

        Kedi kedicik = new Kedi();
        kedicik.setIsim("Pamuk");
        kedicik.setVahsi(false);
        kedicik.setDogumTarihi(LocalDate.of(2020, 3, 1));


        Kartal kartalcik = new Kartal();
        kartalcik.setIsim("liverpool");
        kartalcik.setVahsi(true);
        kartalcik.setDogumTarihi(LocalDate.of(2018, 4, 3));

        System.out.println(kedicik);
        System.out.println(kartalcik);

    }
}
