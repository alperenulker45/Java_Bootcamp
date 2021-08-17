package Gun30.DigerErisimler.Protected.Bir;

public class Doktor {

    protected String ad;

    protected Doktor() {
    }

    public Doktor(String ad) {
        this.ad = ad;
    }
    
    public void print(){
        System.out.println("ad = " + ad);
    }
}
