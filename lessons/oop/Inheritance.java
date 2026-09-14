package lessons.oop;

class Account{
    private String accountNumber;
    private String name;
    private String dob;
    private String phoneNumber;
    private String address;
    private long balance;

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getName() {
        return name;
    }
    public String getDob() {
        return dob;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public long getBalance() {
        return balance;
    }
    public void deposit(long amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Invalid Amount!");
        }
    }
    public void withdraw(long amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public Account(String accountNumber, String name, long balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    public Account(String accountNumber, String name, long balance, String dob, String phoneNumber, String address){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

}
class SavingsAccount extends Account{
    // Don't know about these super constructors fully
    public SavingsAccount(String accountNumber, String name, long balance) {
        super(accountNumber, name, balance);
    }

    public SavingsAccount(String accountNumber, String name, long balance, String dob, String phoneNumber, String address) {
        super(accountNumber, name, balance, dob, phoneNumber, address);
    }

    public void deposit(long amount) {
        super.deposit(amount);
    }
    public void withdraw(long amount) {
        super.withdraw(amount);
    }
    public void fixedDeposit(int duration, long amount) {
        if (amount > 0 && duration > 0) {
            System.out.println("Fixed deposit created for " + duration + " months.");
            super.deposit(amount);
        } else {
            System.out.println("Invalid fixed deposit amount or duration.");
        }
    }

}
public class Inheritance {
    public static void main(String[] args) {
        Account yash = new Account("2425050081", "Yash", 10000l);
        yash.withdraw(-500);
        yash.getBalance();
        yash.deposit(2000);
        System.out.println(yash.getBalance());
        
    }
    
}

