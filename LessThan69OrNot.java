
import java.util.Scanner;

public class LessThan69OrNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n=sc.nextInt();
        if(n>-69 && n<69){
            System.out.println("Magnitude is smaller than 69");
        }
        else{
            System.out.println("Magnitude is greater than 69");
        }
    }
}