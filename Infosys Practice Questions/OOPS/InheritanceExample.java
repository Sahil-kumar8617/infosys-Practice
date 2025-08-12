                                     // *************inheritance *********************
// in inheritance not only the variable aand their value but the function can also be accesed bye the subclasses of parent class 
// but all the differnt kind of subclass have their own object creatd in the main class 

import java.util.*;
                   // parent class 
class Shape{
    int side;
    public void shapeInfo(){
        System.out.println("conatins vertex and arms ");
    }


    
}
// subclass of  parent class 
class Rectangle extends Shape{
    
    public void recarea(int length,int breath){
        
        System.out.println(" area of a rectangle is : "+length*breath);

    }



}
// subclass of parent class 

class Square extends Shape{
    
    public void squareArea(int S){
        System.out.println(" area of a square is : "+S*S);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();// object for the rectangle sub class 
        rec.side=4;
        rec.recarea(6,8);
        Square sqr=new Square(); // object for the Square sub class 
        sqr.squareArea(7);
        sqr.shapeInfo();

        
    }
    
}
