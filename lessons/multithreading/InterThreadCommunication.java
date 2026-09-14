package lessons.multithreading;

class MyData {
    int value;
    boolean flag = true;
    public synchronized void set(int v) {
        while(flag != true) {  // If it's NOT Producer's turn
            try {
                wait();  // Producer waits here
            }
            catch(Exception e) { }
        }
        value = v;  // Set the value
        flag = false;  // Now it's Consumer's turn
        notify();  // Wake up Consumer
    }
    public synchronized int get() {
        int x = 0;
        while(flag != false) {  // If it's NOT Consumer's turn
            try {
                wait();  // Consumer waits here
            }
            catch(Exception e) { }
        }
        x = value;  // Read the value
        flag = true;  // Now it's Producer's turn
        notify();  // Wake up Producer
        return x;
    }
}
class Producer extends Thread {
    MyData data;

    public Producer(MyData d) {
        data = d;
    }
    public void run() {
        int count = 1;
        while(true) {
            data.set(count);
            System.out.println("Producer " + count);
            count++;
        }
    }
}
class Consumer extends Thread {
    MyData data;

    public Consumer(MyData d) {
        data = d;
    }
    public void run() {
        int value;
        while(true) {
            value = data.get();
            System.out.println("Consumer " + value);
        }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        MyData d = new MyData();

        Producer p = new Producer(d);
        Consumer c = new Consumer(d);

        p.start();
        c.start();
        
    }
    
}

