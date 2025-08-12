class vehicle{
    public  void StartEngine(){
        System.out.println("Vehicle Engine Starting.");
    }
}

// second class which is subclass inheriting first class
class Car extends vehicle{
    @Override // overridden concept 
    
    public void StartEngine(){
        System.out.println("Car Engine starting.");
    }
}







public class VehicleManagementSystem {
    public static void main(String[] args) {
        vehicle V=new vehicle();
        Car C=new Car();
        C.StartEngine();
        
    }
    
}
