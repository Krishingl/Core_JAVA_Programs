package com.krush.method_overriding.elc;

import java.util.Scanner;


public class BankApplication
{


    public static void main(String args [])
    {
        Scanner sc= new Scanner(System.in);
          BackAccount ba=null;
        int choice= sc.nextInt();
        
        switch(choice){
            case 1:   

                  String accountHolderName= sc.next();
                  String accountNumber= sc.next();
                  double balance=sc.nextDouble();   

                         ba= new SavingAccount(accountHolderName,accountNumber,balance);
                           
                        ba.displayAccountDetails();
                        ba.calculateInterest();

             break;      
             case 2:

                   accountHolderName= sc.next();
                  accountNumber= sc.next();
                   balance=sc.nextDouble();   

                         ba= new CurrentAccount(accountHolderName,accountNumber,balance);
                     ba.displayAccountDetails();
                       CurrentAccount  ca =(CurrentAccount)ba;

                    
                         ca.calculateInterest();
                             ca.checkOverdraftLimit();
                        break;

        case 3:
         accountHolderName= sc.next();
                  accountNumber= sc.next();
                   balance=sc.nextDouble();   
                    int depositTerm= sc.nextInt();
                         ba= new FixedDepositAccount(accountHolderName,accountNumber,balance,depositTerm);
                     ba.displayAccountDetails();
                     ba.calculateInterest();

        }

    }
}

class BackAccount
{

   protected String accountHolderName;
   protected String accountNumber;
   protected double balance;
   public static final String IFSC_CODE="SBIHYD151285"; 

   public BackAccount(String accountHolderName,String accountNumber, double balance){
          if(accountHolderName.isBlank())
          {
            System.out.println("Account holder name cannot be empty.");
            System.exit(0);

          }
          if(accountNumber.isBlank()){
             System.out.println("Account number cannot be empty.");
             System.exit(0);
          }
          if(balance<0){
               System.out.println("Balance cannot be negative.");
               System.exit(0);
          }


          this.accountHolderName=accountHolderName;
           this.accountNumber=accountNumber;
           this.balance=balance;


   }



   public void calculateInterest(){


    System.out.println("Generic Bank interest Calculation ");
   }
      

      public void displayAccountDetails()
      {

        System.out.println("Account Holder: "+this.accountHolderName);
        System.out.println("Account Number: "+this.accountNumber);
        System.out.println("Balance RS :"+this.balance);
          System.out.println("IFSC CODE :"+IFSC_CODE);
      }





}

class SavingAccount extends BackAccount
{
    protected double interestRate = 4.0;


    public SavingAccount(String accountHolderName,String accountNumber, double balance){
        super(accountHolderName,accountNumber,balance);

    }

    @Override
     public void calculateInterest(){

         System.out.println("Savings Account Interest RS :"+this.balance*interestRate/100);

   
   }




      
    }


    class CurrentAccount extends BackAccount
     {
         
          protected double overdraftLimit = 5000.0;

       public CurrentAccount(String accountHolderName,String accountNumber, double balance){
        super(accountHolderName,accountNumber,balance);

    }


      @Override
     public void calculateInterest(){

         System.out.println("Current accounts do not earn interest.");

   
   }


        public void checkOverdraftLimit(){
            System.out.println("Overdraft limit RS :"+overdraftLimit);
        }

    }
    class FixedDepositAccount extends BackAccount
    {

      protected double interestRate = 6.5;
  protected  int depositTerm ;

                    public FixedDepositAccount(String accountHolderName,String accountNumber, double balance,int depositTerm){
        super(accountHolderName,accountNumber,balance);
        if(depositTerm<0){
            System.out.println("Deposit term must be positive.");
            System.exit(0);
        }
          this.depositTerm=depositTerm;
    }




 @Override
     public void calculateInterest(){

         System.out.println("Fixed Deposit Interest for "+depositTerm+" years RS :"+(this.balance*interestRate/100)*depositTerm);

    }
    }