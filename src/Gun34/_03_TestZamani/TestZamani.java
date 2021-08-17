package Gun34._03_TestZamani;

import org.junit.Assert;
import org.junit.Test;

public class TestZamani {
    //Kullanicinin yazdigi metodu 2 adet test yazarak test ediniz.
    //Metod : Belirlenen sifrenin en az 8 karakterden olusmasi ve icinde en az 1 harf ve rakam olup olmadigini kontrol
    //eden metod olsun.

    @Test
    public void passCheck1()
    {   //olusan sonuc manasinda actual denir.
        boolean olusan = PasswordCheck.passCheck("bayrak5");

        //beklenen manasinda expected denir.
        boolean beklenen = true;

        //1. bolum testera mesaj; 2. bolum expected, 3. bolum actual
        Assert.assertEquals("true bekleniyordu false geldi",beklenen, olusan);
        //mesaj olmadan da kullanilabilir. MESAJ ZORUNLU DEGIL

        //Assert.assertEquals(beklenen, olusan);//bu sekilde de kullanilabilir eger mesaj verilmek istenmiyorsa
    }

    @Test
    public void passCheck2()
    {   //olusan sonuc manasinda actual denir.
        boolean olusan = PasswordCheck.passCheck("bayrak55");

        //beklenen manasinda expected denir.
        boolean beklenen = true;

        //1. bolum testera mesaj; 2. bolum expected, 3. bolum actual
        Assert.assertEquals("true bekleniyordu false geldi",beklenen, olusan);
        //mesaj olmadan da kullanilabilir. MESAJ ZORUNLU DEGIL

        //Assert.assertEquals(beklenen, olusan);//bu sekilde de kullanilabilir eger mesaj verilmek istenmiyorsa
    }


}
