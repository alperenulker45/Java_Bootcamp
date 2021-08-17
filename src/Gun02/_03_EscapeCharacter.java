package Gun02;

public class _03_EscapeCharacter {
    public static void main(String[] args) {

//        \n --> yeni karakter aciyor
//        \t --> tab tusuna basilmis gibi etki yapiyor, yani tab tusuna basilmis gibi bosluk koyar
//        \b --> BackSpace basilmis gibi bir karakter geri siler
//        \" --> cift tirnak koyar
//        \\ --> \ isareti koyar
//        \r --> satir basina kadar olan karakterleri siler
        System.out.println("Merhaba Java");
        System.out.println("Merhaba \n Java"); // alt satira gecer
        System.out.println("Merhaba \tDunya"); // bir tab miktari bosluk birakir Merhaba 	Dunya
        System.out.println("Merhaba\b Dunya"); // bir karakter geri siler Merhab Dunya
        System.out.println("Merhaba\"Dunya\""); // ters slasla javada zaten kullanilan karakterle karismamasi icin.
        //basina \ koyulan ozel karakterler direkt yazdirilabilir
        System.out.println("Merhaba\rDunya");// Satir basina kadar olan karakterleri siler
    }
}
