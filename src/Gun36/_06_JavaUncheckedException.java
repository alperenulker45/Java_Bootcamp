package Gun36;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _06_JavaUncheckedException {

    public static void main(String[] args) //throws FileNotFoundException
    {

        try {
            FileInputStream file = new FileInputStream("liste.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //eger bu listeyi bulamazsa input exception verecek. komutu calistirmaya izin vermiyor.
        //yani try catch zorunlu tutuyor.

    }

}
