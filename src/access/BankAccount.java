package access;

public class BankAccount {

    private int balance;

    // 생성자 자동생성- Alt + Insert → Constructor
    public BankAccount() {
        balance = 0;    // 잔고 빵원의 통장생성
    }

    // public 메서드: deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드: withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드: getBanance
    public int getBalance() {
        return balance;
    }

    //private 메서드: 이 안에서만 쓸수있는것. 외부 접근 안되는 기능
    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야함
        return amount > 0;
    }
}
