class Account {
    protected String holderName;
    protected int accNo;
    protected double balance;

    public Account(String holderName, int accNo, double balance) {
        this.holderName = holderName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }
}

class SavingAccount extends Account {

    protected double interestRate;
    protected double minBalance;

    public SavingAccount(String holderName, int accNo, double balance, double interestRate) {
        super(holderName, accNo, balance);
        this.interestRate = interestRate;
        this.minBalance = 5000;
    }

    @Override
    public void withdraw(double amount) {
        if ((balance - amount) >= minBalance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient funds..");
        }
    }

    @Override
    public String toString() {
        return "SavingAccount [holderName=" + holderName
                + ", accNo=" + accNo
                + ", balance=" + balance
                + ", minBalance=" + minBalance + "]";
    }
}

class CurrentAccount extends Account {

    protected double overdraftLimit;

    public CurrentAccount(String holderName, int accNo, double balance, double overdraftLimit) {
        super(holderName, accNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if ((balance - amount) >= -overdraftLimit) {
            balance = balance - amount;
        } else {
            System.out.println("Overdraft limit exceeded..");
        }
    }

    @Override
    public String toString() {
        return "CurrentAccount [holderName=" + holderName
                + ", accNo=" + accNo
                + ", balance=" + balance
                + ", overdraftLimit=" + overdraftLimit + "]";
    }
}

public class Inheritance1 {

    public static void main(String[] args) {

        SavingAccount obj1 = new SavingAccount("Aiman", 123, 11000, 2.5);

        obj1.withdraw(5000);
        obj1.withdraw(5000);

        System.out.println(obj1.toString());

        CurrentAccount obj2 = new CurrentAccount("Nawaz", 456, 10000, 5000);

        obj2.withdraw(12000);

        System.out.println(obj2.toString());
    }
}