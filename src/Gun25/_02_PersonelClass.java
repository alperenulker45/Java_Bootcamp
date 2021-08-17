package Gun25;

import java.awt.*;

public class _02_PersonelClass {
    //eger burada hemen main girmezsek burada zaten bir class var. Personel Classina ozellik ve method girebiliriz.
    //bu da Class tanimlamanin 2. Yontemidir.

    int id;
    String name;
    String surname;

    // burada main acip islemleri yapabiliriz.

    public static void main (String[] args) {

        _02_PersonelClass mudur=new _02_PersonelClass(); //personel icine mudur isimli degisken tanimlandi.
        mudur.id=1;
        mudur.name="Alperen";
        mudur.surname="Ulker";

        System.out.println(mudur.id);
        System.out.println(mudur.name);
        System.out.println(mudur.surname);

    }
}
