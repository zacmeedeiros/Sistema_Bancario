package application;

import model.entities.Account;
import model.exceptions.BusinessException;

import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double limit = sc.nextDouble();

            Account account = new Account(number,holder,balance,limit);

            System.out.print("Enter amount for withdraw: ");
            Double new_balance = sc.nextDouble();
            account.withdraw(new_balance);
            System.out.print("New balance: " + account.getBalance());
        }
        catch(BusinessException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
