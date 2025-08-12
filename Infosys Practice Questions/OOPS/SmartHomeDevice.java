import java.util.*;
interface SmartDevice{
    void turnOn();
    void turnOff();;

}

class SmartLight implements SmartDevice{

    SmartLight(){
        System.out.println("activating to getting on and Off");
        
    }  
    public void turnOn(){
    System.out.println("smart light is getting on ");
    }
    public void turnOff(){
        System.out.println("smart light is getting off");

    }

}
class SmartFan implements SmartDevice{
    public void turnOn(){
        System.out.println("smart fan is getting on");

    }
    public void turnOff(){
        System.out.println("smart light is getting off");
        
    }

}

public class SmartHomeDevice {
    public static void main(String[] args) {
        SmartDevice fanObject=new SmartFan();
        fanObject.turnOn();
        fanObject.turnOff();
         SmartDevice lightObject=new SmartLight();
         lightObject.turnOff();
         lightObject.turnOn();

        
    }
    
}
