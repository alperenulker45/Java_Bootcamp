package Gun46;


public class Lahmacun implements IFood{


    @Override
    public void taste() {
        System.out.println("Anadolu Tadi");
    }

    @Override
    public double ucret() {
        return 3;
    }

    public void dough () {
        System.out.println("Hamur hazirlaniyor...");
    }

    public void addmeat () {
        System.out.println("Et Koyuluyor...");
    }

    public void bake () {
        System.out.println("Pisiriliyor");
    }

}
