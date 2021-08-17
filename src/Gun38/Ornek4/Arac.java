package Gun38.Ornek4;

public class Arac {
    String renk;
    double motor;
    protected String model;

    public Arac(String renk, double motor, String model) {
        this.renk = renk;
        this.motor = motor;
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motor=" + motor +
                ", model='" + model + '\'' +
                '}';
    }
}
