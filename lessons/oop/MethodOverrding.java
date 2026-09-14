package lessons.oop;

class TV {
    public void switchOn() {
        System.out.println("TV is switched on");
    }
    public void changeChannel() {
        System.out.println("TV channel is changed");
    }
}
class SmartTV extends TV {
    @Override
    public void switchOn() {
        System.out.println("SmartTV is switched on");
    }
    @Override
    public void changeChannel() {
        System.out.println("SmartTV channel is changed");
    }
    public void browse() {
        System.out.println("SmartTV channel is browsed");
    }
}
public class MethodOverrding {
    public static void main(String[] args) {

        // Analogy can be that we can call smartTV(new) as TV(old) but we can't call TV(old) as smartTV(new), smartTv inherits all the methods of TV but it uses them in different way(Meaning methods are overrided) 

        TV t1 = new TV();
        t1.switchOn();
        t1.changeChannel();

        SmartTV t2 = new SmartTV();
        t2.switchOn();
        t2.changeChannel();

        TV t3 = new SmartTV();
        t3.switchOn();
        t3.changeChannel();
        // t3.browse(); Can't use methods of subclass which are only defined in subclass using superclass reference variable
        
    }
    
}

