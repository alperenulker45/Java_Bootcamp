package Gun46;

public class Borsh implements IFood{

    @Override
    public void taste() {
        System.out.println("ilginc bir yemek");
    }

    @Override
    public double ucret() {
        return 3;
    }

    public void boil () {
        System.out.println("boiling");
    }

    public void eattomorrow () {
        System.out.println("it is better to eat tomorrow");
    }
}
