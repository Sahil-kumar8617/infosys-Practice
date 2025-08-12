                                   //  Shape Hierarchy
// Design a class hierarchy for different shapes.
// Requirements:
// Abstract class Shape with method double getArea().
// Derived classes: Circle, Rectangle, Triangle.
// Override the getArea() method accordingly.
abstract class Shape{
 abstract Double getArea();
    
}
 class Circle extends Shape{
     int radius;
      double Pi=3.14;
      
// area setter  for circle 
public void setArea(int radius){
    this.radius=radius;
}


@Override
     public Double  getArea(){
        return ( Pi * radius*radius);
    
}     
 
}    
class Rectangle extends Shape{
    Double  length;
    Double  breath;
    public void  setArea(Double length,Double breath){
        this.length=length;
        this.breath=breath;

    }
    @Override
   public  Double getArea(){
       return (length*breath);
    }
}
class Triangle extends Shape{
    Double Base;
    Double Height;
    public void setArea(Double Base,Double Height){
        this.Base=Base;
        this.Height=Height;

    }
    @Override
    public Double getArea(){
        return (0.5*Base* Height);
    }

}
public class ShapeHeirarchy {
    public static void main(String[] args) {
      Circle circle=new Circle();
      Rectangle rectangle=new Rectangle();
      Triangle triangle=new Triangle();

        circle.setArea(7);
        rectangle.setArea(4.3, 54.0);
      
      triangle.setArea(67.3,88.0);

      circle.getArea();
      rectangle.getArea();
      triangle.getArea();


    //   System.out.println(circle.getArea());
    //   System.out.println(rectangle.getArea());
    // System.out.println(  triangle.getArea());


        
    }
    
}
