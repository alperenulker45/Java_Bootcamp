package Gun26._02;

public class Ornek1 {

    // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.fields: width, length
    // 2-Adım :Çevre bulmak üzere getPerimeter isminde bir metod yazınız.
    // 3-Adım :Dikdörtgenin alanını bulan getArea isimli bir metod yazınız.

    public static void main(String[] args) {

        Rectangle dikdortgen=new Rectangle();
        dikdortgen.length=8;
        dikdortgen.width=5;

        System.out.println("Area = " + dikdortgen.getArea());
        System.out.println("Perimeter = " + dikdortgen.getPerimeter());

    }
}
