package lessons.oop;

abstract class Phone {
    public abstract void sms();
    public abstract void call();
}
// Interfaces achieves polymorphism
interface ICamera { // Normal naming convention is to use "I" for interfaces name
    void clickPhoto(); // Interface is similar to abstract class but all methods are abstract 
    void recordVideo(); // methods are public and abstract by default
}

interface IMusicPlayer { // Interfaces cannot have a object
    void play(); // But they can have reference variable
    void pause();
    void next();
}
// a class becomes an abstract if it implements an interface until unless the class overrides all methods of interface
class Smartphone extends Phone implements ICamera, IMusicPlayer { // Can extend only one class but can implement multiple interfaces
    public void sms() {
        System.out.println("Superclass Phone sms");
    }
    public void call() {
        System.out.println("Superclass Phone call");
    }
    public void clickPhoto() {
        System.out.println("Interface Camera click photo");
    }
    public void recordVideo() {
        System.out.println("Interface Camera record video");
    }
    public void play() {
        System.out.println("Interface Musicplayer play music");
    }
    public void pause() {
        System.out.println("Interface Musicplayer pause music");
    }
    public void next() {
        System.out.println("Interface Musicplayer next music");
    }
    public void method() {
        System.out.println("Subclass Smartphone method");
    }
}
public class InterfaceExample1 {
    public static void main(String[] args) {

        Smartphone s = new Smartphone();
        // Dynamic method dispatch
        Phone p = s;
        ICamera c = s;
        IMusicPlayer m = s;

        p.call();
        p.sms();

        c.clickPhoto();
        c.recordVideo();

        m.play();
        m.pause();
        m.next();

        s.method();
        
    }
    
}

