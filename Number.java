import java.util.*;
public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rand = (int) (Math.random() * (100 + 1));
        int guess,count=10;
        System.out.println("Enter Your Guess");
        guess=sc.nextInt();
        while (guess != rand&&count>0) {
            if (guess < rand) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }
            count--;
            System.out.println("Attempts left : "+count);
            if(count!=0) {
                System.out.println("Enter Your Guess Again");
                guess = sc.nextInt();
            }
        }
        if(count>0) {
            System.out.println("Success!! in " + (10 - count + 1) + " attempts ");
            float scr = count * 10;
            System.out.println("SCORE = " + scr);
        }
        else{
            System.out.println("Exceeded your Attempts ");
        }
    }
}
