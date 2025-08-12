class bankAccoount{
    private String AccountHolderName;
   private Double balance;

   // getter 
   public  String getAccountHolderName(){
    return AccountHolderName;
   }
   public Double getbalance(){
    return balance;
   }
   // setter 
   public void setAccountHolderName(String AccountHolderName){
    this.AccountHolderName=AccountHolderName;
   }
   public void setbalance(Double balance){
    this.balance=balance;
   }

   // constructor
   public bankAccoount(String AccountHolderName,Double balance){
    this.AccountHolderName=AccountHolderName;
    this.balance=balance;

   }


   public  void displayDetails(){
    System.out.println("Account Holder Name :"+AccountHolderName);
    System.out.println("balance :"+ balance);

   }
}
 // second class 
 class SavingAccount extends bankAccoount{
       private  Double interestRate;

       // getter 
       public  Double   getinterestRate(){
        return interestRate;
       }

       // setter 
       public void setinterestRate(Double interestRate){
        this.interestRate=interestRate;
       }
       // cconstructer
       public  SavingAccount(String AccountHolderName,Double interestRate,Double balance){
        super(AccountHolderName, balance);
        this.interestRate=interestRate;

       }

       public void displayDetails(){
        super.displayDetails();
        System.out.println("Interst Rate ;"+ interestRate);
       }
       
       
    }


public class BankingSystem {
    public static void main(String[] args) {
        bankAccoount account1=new bankAccoount("sahil",5000.00);
        account1.displayDetails();
        SavingAccount account2=new SavingAccount("sakhsi", 6.4, 8000.9);
        account2.displayDetails();
        
    }
    
}
