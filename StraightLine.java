
import java.util.Scanner;

public class StraightLine{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1=sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1=sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2=sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2=sc.nextDouble();
        System.out.print("Enter x3: ");
        double x3=sc.nextDouble();
        System.out.print("Enter y3: ");
        double y3=sc.nextDouble();
        double slope1=(y2-y1)/(x2-x1);
        double slope2=(y3-y2)/(x3-x2);
        if(slope1==slope2){
            System.out.println("Point lies on Straight line");
        }
        else{
            System.out.println("Not a straight line");
        }
        
    }
}