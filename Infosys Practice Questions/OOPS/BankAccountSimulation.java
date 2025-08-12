// Bank Account Simulation
// Requirements:
// Create a base class Account with:
// accountNumber, balance
// Methods: deposit(double amount), withdraw(double amount)
// Create two subclasses:
// SavingsAccount — with interestRate and calculateInterest() method
// CurrentAccount — with overdraftLimit and overdraft handling in withdraw
// Test the program by creating objects and performing transaction
class Account{
    long accountNumber;
    double balance=0.0;
    
// method 1
    public void deposit(double amount){
        balance=balance+amount;
        System.out.println(amount+"Ammount deposited succesfully.");
        

    }

    // method 2
    public void withdraw(double Withamount){
       balance=balance-Withamount;

        System.out.println(Withamount+"Amount withdraw succesfuly.");
        System.out.println("your Current balance:"+balance);

    }
}
 // first subclass 
class SavingAccount extends Account{
    int rate;
    int time;

    public void interestRate(double balance,int interestRate){
        Double interest=balance*(interestRate)/100;
        System.out.println(interest);
    }

    public void  calculateInterest(double amount,int Rate,int Time){
        Double  SI=(amount*Rate*Time)/100;
        System.out.println(SI);

    }

}
// second subclass
class CurrentAccount extends Account{
    public void overdraftlimit(int limit){
        double overDraftMoney=limit + balance;




    }
    public void overdraftHandling(int limit,double overDraftMoney ){
        if(overDraftMoney==0){
            System.out.println("your balance is Zero ");
        }
       
     

    }

}


public class BankAccountSimulation {
    public static void main(String[] args) {
        Account account=new Account();
        
SavingAccount savings = new SavingAccount();
savings.deposit(10000);                  // deposit ₹10,000
System.out.println("interest on current balance :");
savings.interestRate(savings.balance, 5); // interest on current balance @ 5%
System.out.println("intest for 2 year: ");
savings.calculateInterest( 10000, 5, 2);  // interest for 2 years

System.out.println("----------------------------");


CurrentAccount current = new CurrentAccount();
current.deposit(2000);                   // deposit ₹2,000
current.withdraw(2500);                  // try withdrawing ₹2,500
current.overdraftlimit(5000);            // set overdraft limit
current.overdraftHandling(5000, current.balance + 5000); // handle overdraft

       


        
    }
    
}
