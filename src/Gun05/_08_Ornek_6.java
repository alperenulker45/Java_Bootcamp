package Gun05;

import java.util.Scanner;

public class _08_Ornek_6 {
    public static void main(String[] args) {
        // kullanicidan kac bilet istedigini (byte) olarak ve sigorta isteyip istemedigini (boolean)
        // olarak alip yazdiriniz

        Scanner input= new Scanner(System.in);
        System.out.print("Kac Bilet Istersiniz=");
        byte bilet= input.nextByte();

        Scanner input2= new Scanner(System.in);
        System.out.print("Sigorta Ister misiniz?");
        boolean sigorta= input2.nextBoolean();

        System.out.println("Bilet Sayisi=" + " "+ bilet + " " + "Sigorta Durumu=" + " " +sigorta);



    }
}
