package Gun37.Ornekler.Sorular.Soru3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Account account = new Account(1234, 8000);
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        boolean is = true;

       dongu : while (is) {

            account.showMenu();
            System.out.println("Enter Your Action");

            try {
                int secim = sc.nextInt();
                account.secimYap(account, secim);
                if(Account.ar) break dongu;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("Baska Islem Yapmak Istiyor musunuz \n E || H");
            String cevap = scs.nextLine();
            is = cevap.equalsIgnoreCase("E");

        }
    }
}
