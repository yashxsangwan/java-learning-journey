package lessons.multithreading;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i+"Hello");
            i++;
            try {
                MyThread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
        
    }
}
public class ThreadTest2 {
    public static void main(String[] args) {
        MyThread t = new MyThread("My Thread 1");
       
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.threadId());
        System.out.println(t.isAlive());
        System.out.println(t.getState());
        t.start();
        t.interrupt();
        System.out.println(t.getState());
        t.setPriority(10);
        System.out.println(t.getPriority());
        
    }
}
