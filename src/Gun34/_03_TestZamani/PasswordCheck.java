package Gun34._03_TestZamani;

public class PasswordCheck {

    public static boolean passCheck (String gelenSifre) {

        if (gelenSifre.length()<8)
            return false;
        else return true;
    }
}
