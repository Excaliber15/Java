
import java.util.Scanner;

public class IntegerOrNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        double n=sc.nextDouble();
        int x=(int)n;
        if((n-x)>0){
            System.out.println("Not Integer");
        }
        else{
            System.out.println("Integer");
        }
    }
}