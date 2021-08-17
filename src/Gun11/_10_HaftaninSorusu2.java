package Gun11;

import java.util.Scanner;

public class _10_HaftaninSorusu2 {
    public static void main(String[] args) {
        //Tus takimindan bir P(x,y) noktasinin x ve y koordinatlari okunacaktir. Bu nokta gosterilen alandaki
        //dikdortgenin icinde ise "icinde", disinda ise "disinda" yazilacaktir. Nokta herhangi bir kenarin ustunde
        //ise "kenarda" yazilacaktir. Alan x(-2,8) y(1,4)

        Scanner giris=new Scanner(System.in);
        System.out.print("x noktasini giriniz= ");
        int x= giris.nextInt();
        System.out.print("y noktasini giriniz= ");
        int y= giris.nextInt();

        if (x>-2 && x<8 && y>1 && y<4)
            System.out.println("icinde");

        else if (y==1 || y==4 && x>=-2 && x<=8)
            System.out.println("Kenarda");

        else if (x==-2 || x==8 && y>=1 && y<=4)
            System.out.println("kenarda");

        else
            System.out.println("disinda");

    }
}
