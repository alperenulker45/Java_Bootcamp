package Gun27_01_Ornek;

public class Utility {

    //Burada kendi sinifimi olusturayim.

    public String getString(int value)
    {
        return String.valueOf(value);
    }

    public int getInt(String value)
    {
        return Integer.parseInt(value);
    }

    //3. Yontem static eklendi.
    public static String getsString(int value)
    {
        return String.valueOf(value);
    }

    //3. Yontem static eklendi.

    public static int getsInt (String value)
    {
        return Integer.parseInt(value);
    }
}
