
import java.util.Scanner;

public class PositionOfPoint{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter X-axis: ");
        double x=sc.nextInt();
        System.out.print("Enter Y-axis: ");
        double y=sc.nextInt();
        if(x==0 && y==0){
            System.out.println("Point passes through origin");
        }
        else if(x==0 && y!=0){
            System.out.println("Point passes through y-axis");
        }
        else if(x!=0 && y==0){
            System.out.println("Point passes through x-axis");
        }
        else{
            System.out.println("Point lies somewhere in the plane");
        }
    }
}