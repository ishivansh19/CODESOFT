public class account {
    public static double balance=5000.0;
    //The Class account Stores the user Balance with a basic initial
    //amount of 5000 which can be accessed and manipulated by ATM class
    public static void setBalance(double amt){
        balance += amt;
    }
    public static void rSet(double amt){
        balance-=amt;
    }
}
