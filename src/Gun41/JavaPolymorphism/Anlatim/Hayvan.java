package Gun41.JavaPolymorphism.Anlatim;

public class Hayvan {

    private String name;

    public Hayvan(String name) {
        this.name = name;
    }

    public void ses() {
        System.out.println("ses cikardi...");
    }

    public static void HayvanSesi(Hayvan hayvan){
        hayvan.ses();
    }
}
