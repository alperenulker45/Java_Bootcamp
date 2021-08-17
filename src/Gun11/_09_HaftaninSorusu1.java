package Gun11;

import java.util.Scanner;

public class _09_HaftaninSorusu1 {
    public static void main(String[] args) {
        //Okunan x ve y koordinatlarina gore noktanin bulundugu bolgeyi gosteren programi yaziniz.
        // (+,+) ->A, (-,+) -> B, (-,-) ->C, (+,-) ->D,

        Scanner giris= new Scanner(System.in);
        System.out.print("x koordinatini giriniz= ");
        int x= giris.nextInt();
        System.out.print("y koordinatini giriniz= ");
        int y= giris.nextInt();

        if (x>0 && y>0)
            System.out.println("A");
        else if (x<0 && y>0)
            System.out.println("B");
        else if (x<0 && y<0)
            System.out.println("C");
        else if (x>0 && y<0)
            System.out.println("D");
        else
            System.out.println("Duzlemde");
    }
}
