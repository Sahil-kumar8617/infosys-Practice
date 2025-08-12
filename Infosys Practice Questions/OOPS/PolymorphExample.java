                                     // *******************Overloading ******************************** Compile time polymorpism 
// the Rules which has to keep in mind when you use overloading 
// rule 1 = if you are using same parameter it will show error beacause same parameter cannot be used but it can olny be used when its return type is different 
// like first function is of int ,and second is of void .
// rule 2 = if you wanted to use same parameter then you need to add one extra parameter in one of the function like 1 is (int age), 2 will be (int age, string name)
import java.util.*;

class Student{ // if you are performing overloading it means in a same class you can create multiple function with same name but it should have different
    // parameter otherwise error ;  ******in same class *****8
String name;
int age;
int rollNo;
// method 1 
void printInfo(String name){
    System.out.println(this.name);
}
// method 2 with different parameter
void printInfo(int age){
  System.out.println(this.age);
}
// method 3 with one same parameter but why its not giving error because i have used one more parameter which is new 
void printInfo(int age,int rollNo){
    System.out.println(this.rollNo);
    System.out.println(this.age);

}


}


public class PolymorphExample {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="sahil";
        s1.rollNo=65;
        s1.age=20;
        
        s1.printInfo(s1.name); // in this only that function has been called where parameter was name 
        
        // s1.printInfo(7,53); // here that function has been called where there was two parameterss

    }
    
}
