package Gun30.DigerErisimler.Protected.Bir;

public class HastaneAnkara {
    public static void main(String[] args) {
        Doktor dr = new Doktor();
        dr.ad="Necdet";


        Doktor dr2=new Doktor("Semih");

        //Ayni pakette oldugu icin protected field ve methodlara erisim saglayabildik.
    }
}
