package lessons.multithreading;

class MyData { // shared resource, both threads are trying to access it simultaneously
    // public synochronized void display(String data){}
    public void display(String data) {
        synchronized(this) { // only one thread can execute this at a time
            for(int i = 0; i < data.length(); i++) {
                System.out.print(data.charAt(i)); // it causes to mix both strings
            }
        }
    }
}
class Thread1 extends Thread {
    MyData d;
    public Thread1(MyData d) {
        this.d = d;
    }
    
    public void run() {
        d.display("Hello World");
    }
}
class Thread2 extends Thread {
    MyData d;
    public Thread2(MyData d) {
        this.d = d;
    }
    
    public void run() {
        d.display("Welcome All");
    }
}
public class SynchronizationTest {
    public static void main(String[] args) {
        MyData data = new MyData();
        Thread1 obj1 = new Thread1(data);
        Thread2 obj2 = new Thread2(data);
        
        obj1.start();
        obj2.start();
        
    }
}
