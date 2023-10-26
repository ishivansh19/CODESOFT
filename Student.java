import java.util.*;
public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float percentage , totalMarks;
        String grade;
        int marks[]=new int[5],i;//taking 5 subjects
        String subject[]={"English","Mathematics","Physics","Chemistry","Computer"};
        System.out.println("Enter the marks in each Subject : ");
        for(i=0;i<5;i++){
            System.out.println(subject[i]);
            marks[i]=sc.nextInt();//Input
        }
        totalMarks=0.0f;
        for(i=0;i<5;i++){
            totalMarks+=marks[i];
        }
        percentage=totalMarks/5;
        //Assign Grade as per Percentage Obtained
        if(percentage>90){
            grade="A+";
        }
        else if(percentage>80){
            grade="A";
        }
        else if(percentage>70){
            grade="B";
        }
        else if(percentage>60){
            grade="c";
        }
        else if(percentage>40){
            grade="D";
        }
        else{
            grade="F";
        }
        //Now display the Result
        System.out.println("\t\t RESULT ");
        System.out.println("Total Marks : "+totalMarks);
        System.out.println("Average Percentage : "+percentage);
        System.out.println("Awarded Grade : "+grade);
    }

}
