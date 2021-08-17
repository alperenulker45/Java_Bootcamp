package Gun41.finalAttribute;

public class ArabaMain {
    public static void main(String[] args) {

        Araba araba = new Araba("Ford");//degeri ford olarak atadik bir daha degismez.

        System.out.println(araba.model); //

        //araba.model = "honda"; -- yapamayiz

        Araba araba2= new Araba("Honda");
        System.out.println(araba2.model);
    }
}
