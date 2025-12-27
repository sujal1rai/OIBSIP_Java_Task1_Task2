package atm;

public class User {
    int userId;
    int pin;
    int balance;

    User(int userId, int pin){
        this.userId = userId;
        this.pin = pin;
        this.balance = 10000;
    }

    int getBalance(){
        return this.balance;
    }
    boolean checkPin(int enteredPin){
        return this.pin == enteredPin;
    }
}
