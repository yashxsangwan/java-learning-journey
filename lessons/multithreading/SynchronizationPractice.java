package lessons.multithreading;

class Atm {
    // try what happens without synchronization
    public synchronized void checkBalance(String name) {
        System.out.println(name + " is checking balance.");
        try {
            Thread.sleep(500);
        }
        catch(Exception e){}
    }
    public synchronized void withdraw(String name, int amount) {
        System.out.println(name + " is withdrawing " + amount);
        try {
            Thread.sleep(500);
        }
        catch(Exception e){}
    }
}
class Customer extends Thread {
    Atm atm;
    String name;
    int amount;

    public Customer(Atm a, String n, int am) {
        atm = a;
        name = n;
        amount = am;
    }
    public void useAtm() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run() {
        useAtm();
    }
}
public class SynchronizationPractice {
    public static void main(String[] args) {
        Atm obj = new Atm();

        Customer c1 = new Customer(obj, "c1", 1000);
        Customer c2 = new Customer(obj, "c2", 2000);

        c1.start();
        c2.start();

        
    }
    
}

