import java.util.*;
public class ATM {
    public void withdraw(double amt){
        if(account.balance<amt){
            System.out.println("Insufficient Balance");
        }
        else{
            account.rSet(amt);
            System.out.println("Amount Withdrawn Succesfully!!");
        }
    }
    public void deposit(double amt){
        account.setBalance(amt);
        System.out.println("Amount Deposited ");
    }
    public void checkBalance(){
        System.out.println("Balance : "+ account.balance+"INR");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ATM obj=new ATM();
        System.out.println("Welcome to the ATM ");
        while(true){
            System.out.println("*******************************");
            System.out.println("Enter 1 to Withdraw");
            System.out.println("Enter 2 to Deposit");
            System.out.println("Enter 3 to Display Balance");
            System.out.println("Enter 0 to EXIT");
            int c=sc.nextInt();
            switch(c){
                case 1:
                    System.out.println("Enter the Amount ");
                    double amt=sc.nextDouble();
                    obj.withdraw(amt);
                    break;
                case 2:
                    System.out.println("Enter the Amount to be Deposited");
                    amt=sc.nextDouble();
                    obj.deposit(amt);
                    break;
                case 3:
                    obj.checkBalance();
                    break;
                case 0:
                    System.out.println("Thank You for Banking With Us...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Enter Valid Choice!!!");
            }
        }
    }
}
