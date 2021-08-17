package Gun35._02_JavaException;

public class _01_JavaRunTimeException {
    public static void main(String[] args) {

        System.out.println("Program Calisti");

        String kelime="";
        kelime.charAt(3);//buraya noktali virgul koymazsak hata aliriz. Hatalarin genel adi exceptiondur.
        //noktali virgul konulmadiginda compile error, derleme zamani hatasi denir. genel ad exceptiondur.
        //Bu durumda program hic calisamaz.

        //Ancak noktali virgul koydugumuzda ise bu durumda runtime error verecek. cunku Stringde 3 uncu index yok.
        //Bu sekilde program calisirken hata aldigimiz icin runtime error denir.

        //Derleme zamani hatasi : compile error, exception.
        //Calisma zamani hatasi : runtime error, exception.
    }
}
