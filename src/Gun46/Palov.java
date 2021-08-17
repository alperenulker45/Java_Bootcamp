package Gun46;

public class Palov implements IFood{

    @Override
    public void taste() {
        System.out.println("Good");
    }

    @Override
    public double ucret() {
        return 4;
    }

    public void fry () {
        System.out.println("it is frying");
    }

    public void boil () {
        System.out.println("boiled");
    }
}
