package Gun11;

import java.util.Scanner;

public class _05_SwitchCase {
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        System.out.print("Enter Day Number= ");
        int week= giris.nextInt();

        switch (week) {
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;

            default: //bunlarin disinda bir sayi girilirse
                System.out.println("Hatali Deger");
        }

    }
    
}
