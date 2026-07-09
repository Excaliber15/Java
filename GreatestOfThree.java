
import java.util.Scanner;

public class GreatestOfThree{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st no: ");
        int a=sc.nextInt();
        System.out.print("Enter the 2nd no: ");
        int b=sc.nextInt();
        System.out.print("Enter the 3rd no: ");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("A is greatest");
        }
        else if(b>=a && b>=c){
            System.out.println("B is greatest");
        }
        else{
            System.out.println("C is greatest");
        }
    }
}