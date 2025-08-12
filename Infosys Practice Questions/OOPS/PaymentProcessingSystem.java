                      // ************************* interface understanding********************


import java.util.*;
// interface created 
interface Payment{ 
    void processPayment(double amount); // we don't need to define or insert content of the method in interface we just need to initialize it .
    // the rule of not initializing over here is that in every subclasses which will implements the interface has to commpulasory use this method and define it with content 
    // whatever they need to.
}

class CreditCardPayment implements Payment{
    private String CardHolderName;
    private long cardNumber;
    
   
    public CreditCardPayment(String CardHolderName,long cardNumber ){ // constructor is being alsways beeing called first in the class without even called also.
        this.CardHolderName=CardHolderName;
        this.cardNumber=cardNumber;
       
    }
    public void processPayment(double amount){// the method which is being implemented from the interface.
         System.out.println("Paid "+amount+ " by "+this.CardHolderName+" using credit card ending with "+this.cardNumber%1000);

    }


}

class PayPalPayment implements Payment{
    private String Email;
    
    PayPalPayment(String Email){ //constructor

        this.Email=Email;
    }
    public void processPayment(double amount){//method which is being used or defined in another class with differnt functionality.
        System.out.println("Paid "+amount+ " using PayPal account: "+this.Email);
    }

}
public class PaymentProcessingSystem {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter payment method (1. CreditCard 2. PayPal):");
    int choice =sc.nextInt();

     if(choice==1){

         Payment object1=new CreditCardPayment("sahil Kumar",7766-3843-6787); // object creation
         object1.processPayment(22000);

    }

    if(choice==2){

         Payment object2=new PayPalPayment("sahil8617@gmail.com"); // second object 
        object2.processPayment(22000);
          

    }


    
   

   

   




 

    
  

    
   } 
}
