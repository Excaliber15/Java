
import java.util.Scanner;

public class CircumArea{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius=sc.nextDouble();
        double pi=3.14;
        double circumference=2*pi*radius;
        double area=pi*radius*radius;
        if(area>circumference){
            System.out.println("Area is Greater than Circumference");
        }
        else if(circumference>area){
            System.out.println("Circumference is greater than area");
        }
        else{
            System.out.println("Both are eqaul");
        }
    }
}