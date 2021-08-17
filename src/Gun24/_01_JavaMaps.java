package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _01_JavaMaps {
    public static void main(String[] args) {

        Map<Integer, Integer> m=new HashMap<>();//Key i ve Valuesi olan bir MAP tanimlandi.

        m.put(2, 11);// 2 KEY ine 11 degeri atandi.
        m.put(3, 12);
        m.put(6, 13);
        m.put(2, 14);//2 KEY daha once tanimlanmisti. Burada guncellendi artik KEY2 = 14.

        //1. Yazdirma Yontemleri
        System.out.println("m.get(2) = " + m.get(2));//2 Key deki deger alindi.  KEY 2nin degerini yazdirir.
        System.out.println("m.keySet() = " + m.keySet());//m MAP inin KEY lerini yazdirir.
        System.out.println("m.values() = " + m.values()); // m MAP inin VALUES lerini yazdirir.
        System.out.println("m = " + m); // KEY=VALUE seklinde yazdirir.

        //m.get(2) = 14
        //m.keySet() = [2, 3, 6]
        //m.values() = [14, 12, 13]
        //m = {2=14, 3=12, 6=13}

        //2. Yazdirma Yontemleri Foreach ile.

        for (Integer ky : m.keySet()) //burada foreach ile KEY ler donecek.
        {
            System.out.println("ky = " + ky);
        }

        for (Integer vl : m.values())  //burada foreach ile VALUE ler donecek
        {
            System.out.println("vl = " + vl);
        }

        for (Map.Entry <Integer, Integer> keyValue : m.entrySet())//burada MAP i hem KEY hem VALUE alacak sekilde.
        {
            System.out.println("keyValue.getKey() = " + keyValue.getKey());//Keyler yazilacak
            System.out.println("keyValue.getValue() = " + keyValue.getValue());//Value ler yazilacak.
        }

        boolean buKeyVarmi= m.containsKey(2);//2 anahtari var mi diye bakar.
        boolean buValueVarmi=m.containsValue(12);//12 Value var mi diye bakar.
        System.out.println("buKeyVarmi = " + buKeyVarmi);
        System.out.println("buValueVarmi = " + buValueVarmi);

        m.remove(2);//2 anahtarini siler(degeriyle birlikte)
        System.out.println("m.remove(2)'den sonra " + m);

        m.clear();//Mapin Key ve Valuelerini tamamen siler. Map bos olur.
        System.out.println("m.clar()'dan sonra = " + m);
    }
}
