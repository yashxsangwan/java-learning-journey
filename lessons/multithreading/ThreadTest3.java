package lessons.multithreading;

class MyThread extends Thread {
    public void run() {
        int count = 1;
        while(true) {
            System.out.println(count++ + "My thread");
        }
    }
}
public class ThreadTest3 {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();
        // t.setDaemon(true); // makes the thread background thread
        t.start();
        // after excetution, the main thread terminates so no output is shown
        
        /*
        try { // this block makes the main thread sleep for given time, in which background thread(daemon thread) will execute
            Thread.sleep(1000); 
        }
        catch(Exception e) {

        }
        */
        // Thread mainThread = Thread.currentThread();
        // mainThread.join();

        int count = 1;
        while(true) {
            System.out.println(count++ + "Main");
            Thread.yield(); // makes the main method wait for some time or tells cpu that it will yield some of its time
        }
        

    }
    
}

