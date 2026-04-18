
import java.util.Scanner;

public class lessMarks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of A: ");
        int a=sc.nextInt();
        System.out.print("Enter the marks of B: ");
        int b=sc.nextInt();
        System.out.print("Enter the marks of C: ");
        int c=sc.nextInt();
        if(a<=b && a<=c){
            System.out.print("A scored the least");
        }
        else if(b<=a && b<=c){
            System.out.print("B scored the least");
        }
        else{
            System.out.println("C scored the least");
        }
    }
}