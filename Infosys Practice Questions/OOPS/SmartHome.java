interface VoiceControl {
  public void voiceOn();
   

}
// Second interface
interface AppControl{
    public void appOn();
       

    

}
// class which implement both the interfaces 
class SmartLight implements AppControl,VoiceControl{

    @Override
    public void appOn() {
       
         System.out.println("Smart Light turned on via App");
    }

    @Override
    public void voiceOn() {
         System.out.println("Smart Light turned on via Voice");
        
    }
    

    
        
    }

public class SmartHome {
public static void main(String[] args) {
    SmartLight light=new SmartLight();
    light.appOn();
    light.voiceOn();
    
}    
}


