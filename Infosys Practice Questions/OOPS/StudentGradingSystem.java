
// Requirements:
// Create a Student class with:
// Fields: name, marks1, marks2, marks3
// Method: getGrade() — returns grade based on average marks.
// Grade criteria example:
// 90+ → A
// 75–89 → B
// 50–74 → C
// Below 50 → F
// Create multiple students, calculate their grades, and display results.

class Student{
 String name;
 int marks1;
 int marks2;
 int marks3 ;
 float average;
 

 public void setGrade(String name,int marks1,int marks2,int marks3){
    int sum=marks1+marks2+marks3;
     average=sum/3;
     
   this.name=name;
   this.marks1=marks1;
   this.marks2=marks2;
   this.marks3=marks3;

 }

 public void getgrade(){
    System.out.println("Student :"+name +" Average score :"+average);
 if(average>90){
        System.out.println("grade a");
    }else if(average >=75 && average <=89){
        System.out.println("grade b");
    }else if (average >=50 && average <=74){
        System.out.println("grade c");
    }else{
        System.out.println("grade f");
    }


 }
 
}
public class StudentGradingSystem {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setGrade("sahil",54,75,74);
        

         Student student2=new Student();
        student2.setGrade("subhanshu",75,86,54);
       

        student1.getgrade();

       
    }
    
}
