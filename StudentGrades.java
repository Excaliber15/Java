
import java.util.Scanner;

public class StudentGrades{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks=sc.nextInt();
        if(marks>=91 && marks<=100){
            System.out.println("Excellent");
        }
        else if(marks>=81 && marks<=90){
            System.out.println("Very Good");
        }
        else if(marks>=71 && marks<=80){
            System.out.println("Good");
        }
        else if(marks>=61 && marks<=70){
            System.out.println("Can do better");
        }
        else if(marks>=51 && marks<=60){
            System.out.println("Average");
        }
        else if(marks>=40 && marks<=50){
            System.out.println("Below Average");
        }
        else{
            System.out.println("Fail");
        }
    }
}