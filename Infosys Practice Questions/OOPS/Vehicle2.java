import java.util.*;

class vehicle{
    String  brand;
    String Model;
    int year;
    // constructor
    public vehicle(String brand,String Model,int year){
     this.brand=brand;
     this.Model=Model;
     this.year=year;
    }
// method 
    public void displayInfo(){
        System.out.println("Vehicle's Brand="+ brand);
        System.out.println("Vehicle's Model="+Model);
        System.out.println("Vehicle year="+year);
    }
}
// inheritance 
class Car extends vehicle{
    int numDoors;

    public Car(String brand,String Model,int year){
        
        displayInfo(){
            System.out.println("Number of doors ="+ numDoors);
        }

    }

}


public class Vehicle2 {
    public static void main(String[] args) {
        
    }
    
}
