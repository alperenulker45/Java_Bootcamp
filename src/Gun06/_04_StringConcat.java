package Gun06;

public class _04_StringConcat {
    public static void main(String[] args) {
        //concat bir stringi digerine ekler. Yani iki stringi topluyor gibi.

        String s1="Merhaba";
        String s2="Dunya";

        //s1.concat(s2) --> s1 ve s2 yi birlestirir.


        System.out.println("s1.concat(s2) = " + s1.concat(s2));
        System.out.println("s1.concat(s2) = " + s1.concat("").concat(s2));
        System.out.println("s1.concat(s2) = " + s1.concat(" "+s2));
        //araya bosluk koymak icin son 2 sekilde yapilan sekilde yapilabilir.

        s1=s1.concat(s2);
        //seklinde tanimlama da yapilabilir.


    }
}
