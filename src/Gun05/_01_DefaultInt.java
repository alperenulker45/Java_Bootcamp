package Gun05;

public class _01_DefaultInt {
    public static void main(String[] args) {

        String kenar="40";
        short shortkenar= Short.parseShort(kenar);

        short cevre = (short) (shortkenar+shortkenar+shortkenar+shortkenar);

        System.out.println("cevre = " + cevre);

        // yukarida toplama islemlerini defaul int olarak kabul ettigi icin toplama islemini yapmiyor.
        // o yuzden islemin basina short olarak tanimlama yapmak gerekiyor.
        // short cevre = (short) shortkenar+shortkenar+shortkenar+shortkenar; seklinde olmasi gerekiyor.

        // javada tam sayilar ve tam sayi degiskenleri default olarak int kabul ediliyor
        // islemin sag tarafi int kabul edilir. dolayisiyla Narrowing Casting yapilmasi gerekli (short tanimlama)
    }
}
