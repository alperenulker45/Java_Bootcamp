package Gun23;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class _06_OrnekSoru {
    public static void main(String[] args) {
        //"aaabbccccdeeeff" seklinde verilen bir stringi yine string olarak "3a2b4c1d3e2f"
        //seklinde yazdiran methodu

        String harfler= "aaabbccccdeeeffg";
        degistir(harfler);

    }

    public static void degistir(String str)
    {
        String []harfdizi=str.split("");
        Arrays.sort(harfdizi);
        String sonuc="";
        int miktar=0;
        for (int i = 0; i <str.length() ; i++)
        {
            miktar=0;
            for (int j = 0; j <str.length() ; j++)
            {

                if (harfdizi[i].equals(harfdizi[j]))
                    miktar++;

            }
            if (!sonuc.contains(harfdizi[i])) {
                sonuc+=miktar+harfdizi[i];
            }


        }
        System.out.println(sonuc);
    }
}
