package Gun23;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _03_SETS {
    public static void main(String[] args) {

        //Hashset kendi algoritmasina gore en hizli getirecek sekilde tutar.
        HashSet <String> ls= new HashSet<>();
        ls.add("bir");
        ls.add("iki");
        ls.add("uc");
        ls.add("dort");



        // Eklenme sirasina gore elemanlari tutar.

        LinkedHashSet<String> lhs=new LinkedHashSet<>(Arrays.asList());

        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");


        //Alfabetik siraya gore her eklemede saklar.

        TreeSet<String> lhs2=new TreeSet<>();

        lhs2.add("bir");
        lhs2.add("iki");
        lhs2.add("uc");
        lhs2.add("dort");
        lhs2.add("bes");

        //Aritmetik siraya gore saklar

        TreeSet<Integer> lhs3=new TreeSet<>();

        lhs3.add(1);
        lhs3.add(5);
        lhs3.add(5);
        lhs3.add(17);
        lhs3.add(20);
    }
}
