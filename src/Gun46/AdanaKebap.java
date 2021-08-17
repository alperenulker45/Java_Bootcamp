package Gun46;


public class AdanaKebap implements IFood{

    @Override
    public void taste() {
        System.out.println("delicious");
    }

    @Override
    public double ucret() {
        return 5;
    }

    public void marinade () {
        System.out.println("Marine Ediliyor");
    }

    public void grill () {
        System.out.println("Grill Edildi");
    }
}
