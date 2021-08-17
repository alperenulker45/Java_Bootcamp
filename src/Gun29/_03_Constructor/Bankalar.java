package Gun29._03_Constructor;

public class Bankalar {
    public static void main(String[] args) {

        Banka banka1=new Banka("Is Bankasi", 1956, 1905);
        Banka banka2=new Banka("Ziraat", 1975);
        Banka banka3=new Banka("vakif");

        System.out.println("banka1 = " + banka1);
        System.out.println("banka2 = " + banka2);
        System.out.println("banka3 = " + banka3);
    }
}
