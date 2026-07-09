
import java.util.Scanner;

public class Quadrant{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x: ");
        int x=sc.nextInt();
        System.out.print("Enter y: ");
        int y=sc.nextInt();
        if(x==0 && y==0){
            System.out.println("passes through origin");
        }
        else if(x==0 && y!=0){
            System.out.println("y-axis");
        }
        else if(x!=0 && y==0){
            System.out.println("x-axis");
        }
        else if(x>0 && y>0){
            System.out.println("1st Quad");
        }
        else if(x<0 && y>0){
            System.out.println("2nd Quad");
        }
        else if(x<0 && y<0){
            System.out.println("3rd Quad");
        }
        else if(x>0 && y<0){
            System.out.println("4th Quad");
        }
        else{
            System.out.println("Point lies somewhere in the plane");
        }
    }
}