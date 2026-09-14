package lessons.oop;

interface Member {
    void callback();
}
class Store {
    Member[] mem = new Member[100];
    private int count = 0;

    public void register(Member m) {
        mem[count++] = m;
    }
    public void saleInvite() {
        for(int i = 0; i < mem.length; i++) {
            mem[i].callback();
        }
    }
}
class Customer implements Member {
    private String name;

    public Customer(String n) {
        this.name = n;
    }
    public void callback() {
        System.out.println("Ok, I will visit ---" + this.name);
    }
}
public class InterfaceExample2 {
    public static void main(String[] args) {
        Store s = new Store();

        Customer c1 = new Customer("Yash");
        Customer c2 = new Customer("David");

        s.register(c1);
        s.register(c2);
        s.saleInvite();
     
    }
    
}

