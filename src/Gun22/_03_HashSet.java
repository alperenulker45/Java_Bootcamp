package Gun22;

import java.util.HashSet;

public class _03_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> SetA=new HashSet<>();
        SetA.add(1);
        SetA.add(2);
        SetA.add(3);
        SetA.add(4);
        SetA.add(5);

        HashSet<Integer> SetB=new HashSet<>();
        SetB.add(4);
        SetB.add(5);
        SetB.add(6);
        SetB.add(7);

        System.out.println("Birlesik Hali = " + birlestir(SetA, SetB));
        System.out.println("Farki = " + farki(SetA, SetB));
        System.out.println("Ortak Elemanlari = " + ortakElemanlar(SetA, SetB));
    }

    public static HashSet<Integer> birlestir(HashSet<Integer> SetA, HashSet<Integer> SetB)
    {
        HashSet<Integer> birlesikhali=new HashSet<>();
        birlesikhali.addAll(SetA);
        birlesikhali.addAll(SetB);

        return birlesikhali;

    }

    public static HashSet<Integer> farki (HashSet<Integer> SetA, HashSet<Integer> SetB)
    {
        HashSet<Integer> fark=new HashSet<>(SetA); // setA dan kopya oluşturuldu

        fark.removeAll(SetB);

        return fark;

    }

    public static HashSet<Integer> ortakElemanlar (HashSet<Integer> SetA, HashSet<Integer> SetB)
    {
        HashSet<Integer> ortakelemanlar=new HashSet<>(SetA); // setA dan kopya oluşturuldu

        ortakelemanlar.retainAll(SetB);

        return ortakelemanlar;

    }
}
