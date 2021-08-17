package Gun37.Ornekler.Sorular.Soru3;

import java.util.Scanner;

public class Account {

    private int accountNumber;
    private int balance;

    private int dailyLimit=5000;

    public static boolean ar=false;

    Scanner sc = new Scanner(System.in);

    public Account(int accountNumber, int balance) {
        setAccountNumber(accountNumber);
        this.balance=balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }


    public void deposit () {
        System.out.println("Enter Deposit Amount");
        int dep = sc.nextInt();
        this.balance+=dep;
        System.out.println("New Balance : " + getBalance());
    }

    public void withdraw () {
        System.out.println("Enter Withdraw Amount");
        int wtd= sc.nextInt();
        if (wtd>this.balance) throw new RuntimeException("Balance Insufficient");
        else if (wtd>5000 || dailyLimit<0) throw new RuntimeException("Daily Limit Over" + " " +
                "Daily Limit : " + dailyLimit);

        else {this.balance-=wtd; dailyLimit-=wtd;}
        System.out.println("New Balance : " + getBalance());
        System.out.println("dailyLimit = " + dailyLimit);


    }

    public void showMenu(){
        System.out.println(" 1. Show Balance \n 2. Deposit \n 3. Withdraw \n 4. Exit");
    }

    public void secimYap(Account account, int secim) throws Exception {

            switch (secim) {

                case 1:
                    System.out.println(account.getBalance());
                    break;

                case 2:
                    account.deposit();
                    break;

                case 3:
                    account.withdraw();
                    break;

                case 4:
                    ar = true;
                    break;

                default:
                    System.out.println("Gecersiz Secim - Tekrar Giris Yapiniz");

            }
    }

}
