package Gun37.Ornekler.Sorular.Soru2;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        int usernum=1;
        boolean usernameIste = true;
        String username="";
        do {
            if (usernameIste) {
            System.out.println("Enter Username " + usernum);
            username = sc.nextLine();}

            System.out.println("Enter Password");
            String password = sc.nextLine();
            try {
                User user = new User(username, password);
                users.add(user);
                usernum++;
                usernameIste=true;

            }
            catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Enter User Again");
                usernameIste=false;
            }

        } while (users.size()<2);

        System.out.println(users);


    }
}
