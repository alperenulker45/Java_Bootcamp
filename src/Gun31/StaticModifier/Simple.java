package Gun31.StaticModifier;

public class Simple {

    int a;//olusturulacak nesneye ait degisken
    static int b;//Class'a ait degisken, nesneye degil!!!

    void artir(){
        a++;
        b++;
    }

    public static void main(String[] args) {
        Simple ornek1= new Simple();
        ornek1.a=5;
        //ornek1.b --> bu sekilde bir degisken tanimlayamiyoruz cunku b degiskeni nesneye degil classa ait degisken
        //dolayisiyla b yi Classla atamaliyiz.

        Simple ornek2= new Simple();
        ornek2.a=7;

        Simple.b=6;
        Simple.b=8;//burada b en son atanan degeri alacak.

        System.out.println("ornek1.a = " + ornek1.a);//5
        System.out.println("ornek2.a = " + ornek2.a);//7
        System.out.println("Simple.b = " + Simple.b);//8

        ornek1.artir();
        ornek2.artir();

        System.out.println("ornek1.a = " + ornek1.a);
        System.out.println("ornek2.a = " + ornek2.a);
        System.out.println("Simple.b = " + Simple.b);//metodu 2 defa kullandigimiz icin nesneye ait b degiskeni
        //2 kez artti ve 10 oldu.
    }
}
