package atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User(101,4321);

        System.out.println("Enter user id: ");
        int id = scanner.nextInt();

        System.out.println("Enter pin: ");
        int pin = scanner.nextInt();

        if(user.userId == id && user.checkPin(pin)){
            System.out.println("Login Successful");
            Atm atm = new Atm(user);
            atm.showMenu();
        } else{
            System.out.println("Invalid userId or pin!");
        }
    }
}
