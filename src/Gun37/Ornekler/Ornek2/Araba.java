package Gun37.Ornekler.Ornek2;

public class Araba {

    private String renk;
    private String model;
    private double motor;
    private int kapisSayisi;

    public Araba() {
    }

    public Araba(String renk, String model, double motor, int kapisSayisi) {
        setRenk(renk);
        setModel(model);
        setMotor(motor);
        setKapisSayisi(kapisSayisi);
    }
    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getKapisSayisi() {
        return kapisSayisi;
    }

    public void setKapisSayisi(int kapisSayisi) {
        if (kapisSayisi == 2 || kapisSayisi == 4)
            this.kapisSayisi = kapisSayisi;

        else System.out.println("Kapi Sayisi 2 veya 4 olmalidir");

    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motor=" + motor +
                ", kapisSayisi=" + kapisSayisi +
                '}';
    }
}
