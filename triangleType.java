
import java.util.Scanner;

public class triangleType{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st side: ");
        double side1=sc.nextDouble();
        System.out.print("Enter 2nd side: ");
        double side2=sc.nextDouble();
        System.out.print("Enter 3rd side: ");
        double side3=sc.nextDouble();
        if(side1==side2 && side2==side3){
            System.out.println("Equilateral Traiangle");
        }
        else if(side1==side2 || side2==side3 || side3==side1){
            System.out.println("Isosceles Triangle");
        }
        else{
            System.out.println("Scalene Triangle");
        }
    }
}