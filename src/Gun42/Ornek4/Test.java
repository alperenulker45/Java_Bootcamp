package Gun42.Ornek4;

public class Test implements IGoster, IYazdir { // 2 Tane Interfaceden implement edebiliyoruz.

    @Override
    public void goster() {
        System.out.println("goster");
    }

    @Override
    public void yaz() {
        System.out.println("yaz");

    }

    @Override
    public void yaz(String mesaj) {
        System.out.println(mesaj+"yaz");
    }

}
