import java.util.Scanner;

public class SidesOfTriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.print("Enter c: ");
        int c=sc.nextInt();
        
        if((a+b>c) && (b+c>a) && (c+a>b)){
            System.out.println("Valid Sides of Triangle");
        }
        else{
            System.out.println("Not Valid sides of Triangle");
        }
    }
}