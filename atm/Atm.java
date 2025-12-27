package atm;

import java.util.Scanner;

public class Atm {
    User user;
    String history = "";

    Atm(User user){
        this.user = user;
    }

    void showMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("******* ATM Menu *******");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 :
                    showTransactionHistory();
                    break;
                case 2 :
                    System.out.println("Enter amount to withdraw: ");
                    int withdrawAmt = scanner.nextInt();
                    withdraw(withdrawAmt);
                    break;
                case 3 :
                    System.out.println("Enter amount to deposit: ");
                    int depositAmt = scanner.nextInt();
                    deposit(depositAmt);
                    break;
                case 4 :
                    System.out.println("Enter amount to transfer: ");
                    int transferAmt = scanner.nextInt();
                    transfer(transferAmt);
                    break;
                case 5 :
                    System.out.println("Thank you for using ATM");
                    break;
                default :
                    System.out.println("Invalid choice!");
            }
            scanner.close();
        }while (choice != 5);
    }

    void withdraw(int amount){
        if(amount < 0){
            System.out.println("Invalid amount");
        } else if (amount <= user.balance) {
            user.balance -= amount;
            history += "Withdrawn" + amount + "\n";
            System.out.println("Please collect your cash");
            System.out.println("Remaining balance: " + user.balance);
        } else{
            System.out.println("Insufficient balance");
        }
    }

    void deposit(int amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
        } else{
            user.balance += amount;
            history += "Deposited" + amount + "\n";
            System.out.println("Amount deposited successfully");
            System.out.println("Current balance is: " + user.balance);
        }
    }

    void transfer(int amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
        } else if(amount <= user.balance){
            user.balance -= amount;
            history += "Transferred" + amount + "\n";
            System.out.println("Amount transferred successfully");
            System.out.println("Remaining balance is: " + user.balance);
        } else{
            System.out.println("Insufficient balance");
        }
    }

    void showTransactionHistory(){
        if(history.isEmpty()){
            System.out.println("No transactions yet");
        } else{
            System.out.println("\n*** History ***");
            System.out.println(history);
        }

    }
}
