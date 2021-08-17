package Gun24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03_JavaMaps {
    public static void main(String[] args) {
        //HashMap, LinkedHashMap, TreeMap

        //HashMap kendi algoritmasina gore en hizli getirecek sekilde saklar.
        Map<Integer, String > hm=new HashMap<>();
        hm.put(9, "fox");
        hm.put(2, "cat");
        hm.put(30, "dog");
        hm.put(4, "bear");
        hm.put(7, "snake");
        hm.put(11, "swan");

        System.out.println("hm = " + hm);

        //LinkedHashMap : Kullanicinin girdigi siraya gore saklar
        Map<Integer, String > lm=new LinkedHashMap<>();
        lm.put(9, "fox");
        lm.put(2, "cat");
        lm.put(30, "dog");
        lm.put(4, "bear");
        lm.put(7, "snake");
        lm.put(11, "swan");

        System.out.println("lm = " + lm);
        //lm = {9=fox, 2=cat, 30=dog, 4=bear, 7=snake, 11=swan}

        //TreeMap : Keylerin alfabetik veya numerik (kucukten buyuge) siralamaya gore getirir.

        Map<Integer, String > tm=new TreeMap<>();
        tm.put(9, "fox");
        tm.put(2, "cat");
        tm.put(30, "dog");
        tm.put(4, "bear");
        tm.put(7, "snake");
        tm.put(11, "swan");

        System.out.println("tm = " + tm);
        //tm = {2=cat, 4=bear, 7=snake, 9=fox, 11=swan, 30=dog}


    }
}
