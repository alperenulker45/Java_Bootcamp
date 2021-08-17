package Gun20;

import java.util.ArrayList;
import java.util.Arrays;

public class _04_ArrayList {

    public static void main(String[] args) {
        int[] dizi={2,3,45,66}; // dizilerde başlangıç
        // değeri vererek tanımlama

        //ArrayList de başlangıç değerleri vererek aşağıdaki
        // gibi tanımlayabiliriz.
        ArrayList<String> list10= new ArrayList<>(Arrays.asList("alperen", "semih"));
        System.out.println("list10 = " + list10);
        ArrayList<String> list1= new ArrayList<>(){
            {
                add("Almanca");
                add("İngilizce");
                add("Türkçe");
                add("Rusça");
            }
        };

        System.out.println("list1 = " + list1);

        ArrayList<String> list2=new ArrayList<>();
        list2.add("Rusça");
        list2.add("Türkçe");
        list2.add("Arapça");

        System.out.println("list2 = " + list2);

        list1.addAll(list2); // list1 e list2 yi ekler
        System.out.println("list1 = " + list1);

        list1.removeAll(list2); // list1 den list2 yi çıkarır
        System.out.println("list1 = " + list1);

        if (list1.contains("Almanca"))
        {
            System.out.println("Almanca var");
        }

    }
}
