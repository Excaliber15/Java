

import java.util.Scanner;

public class Rectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        double l=sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b=sc.nextDouble();
        double area=l*b;
        double perimeter=2*(l+b);
        if(area>perimeter){
            System.out.println("Area is Greater than perimeter");
        }
        else if(perimeter>area){
            System.out.println("Perimeter is greater than area");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}