package Gun41.finalAttribute;

public class Araba extends Tasit{

    public Araba(String model) {
        super(model);
    }
    //super.model = "opel" -- boyle birsey yapamayiz cunku field final sadece constructor olusurken veririz.
    //final degiskene ilk deger atandiktan sonra tekrar deger atanamaz.
}
