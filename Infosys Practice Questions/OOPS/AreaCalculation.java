

class Rectangle{
    private int length;
    private int breath;

    // getter 
    public int getlength(){
        return length;
    }
    public int getbreath(){
        return breath;
    }

    // setter 
    public void setlength(int length){
        this.length=length;

    }
    public void setbreath(int breath){
        this.breath=breath;

    }

    // method to calculate area 
    public void calculateArea(int length,int breath){
    int area = length*breath;
    System.out.println(area);

}
// constructor 
public  Rectangle(int length,int breath){
    this.length=length;
    this.breath=breath;

}

}





public class AreaCalculation {
    public static void main(String[] args) {
         Rectangle rectanngle=new Rectangle(34,43);


        System.out.println("length of rectangel "+rectanngle.getlength());
        System.out.println("breath f rectangel"+ rectanngle.getbreath());


         rectanngle.calculateArea(rectanngle.getlength(),rectanngle.getbreath());
         

         
    }
}
