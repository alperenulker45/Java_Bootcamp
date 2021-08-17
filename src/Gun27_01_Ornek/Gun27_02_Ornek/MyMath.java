package Gun27_01_Ornek.Gun27_02_Ornek;

public class MyMath {

    public static int getRandom (int rakam)
    {
        return (int) (Math.random()*rakam);

    }

    public static int getMax (int value1, int value2)
    {
        return Math.max(value1, value2);
    }

    public static int getMin (int value1, int value2)
    {
        return Math.min(value1, value2);
    }

    public static double getPow (double value1, double value2)
    {
        return Math.pow(value1, value2);
    }

    public static double getSqrt (double value)
    {
        return Math.sqrt(value);
    }

    public static int getAbs(int value) {return Math.abs(value);}

    public static int diziTopla (int [] dizi)
    {
        int toplam=0;
        for (int e : dizi)
            toplam+=e;
        return toplam;
    }

}
