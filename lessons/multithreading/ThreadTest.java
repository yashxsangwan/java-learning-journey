package lessons.multithreading;

class MyRunnable implements Runnable {
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + "  Hello");
            i++;
        }
}
public class ThreadTest extends Thread {
    }
    // 3 methods used to create and run another thread
    // class extending Thread class other than main class
    // main class extending Thread class
    // class implementing Runnable interface other than main class
    // all 3 methods should override run() method. this is the the code which will be executed
    // Thread class object must be created
    // start() method executed the new thread or the code which is in run() method
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        Thread th = new Thread(m);
        th.start();
        
        int i = 1;
        while(true) {
            System.out.println(i + " World");
            i++;
        }
        
    }
    
}

