
class Student{ 

    private String studentName;
    private int rollNumber;
    private int marks;

    // getter 
public String getStudentName(){
    return studentName;
}

public Integer getRollNumber(){
    return rollNumber;

}
public Integer getMarks(){
    return marks;
}

// setter 
public void setrollNumber(int rollNumber){

    this.rollNumber=rollNumber;
}

public void setstudentName(String studentName){

    this.studentName=studentName;
}
public void setmarks(int marks){
    this.marks=marks;
}




 // method for grading system 
public  void gradingSystem(int marks){
         if(marks >=90 ){

    System.out.println("Grade A");
}
else if(marks >= 75 &&marks <=89){
    System.out.println("Grade B");
}
else if( marks >=60 && marks <=74){
    System.out.println("Grade C");
}
else if (marks < 60 ) {
    System.out.println("Fail");
}

}


             // constructor 
public Student(String studentName,int rollNumber,int marks){
    this.studentName=studentName;
    this.rollNumber=rollNumber;
    this.marks=marks;



    } 

}



class StudentGradeEvaluator{
    public static void main(String[] args) {
        Student student =new Student("sahil",5,78);
        System.out.println("Name :"+ student.getStudentName());
        System.out.println("Roll no:"+student.getRollNumber());
        System.out.println("Marks:"+student.getMarks());


        student.gradingSystem(student.getMarks());
    }
}


