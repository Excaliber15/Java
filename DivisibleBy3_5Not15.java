
import java.util.Scanner;

public class DivisibleBy3_5Not15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        if((n%5==0 || n%3==0) && (n%15!=0)){
            System.out.println("Divisible by 5 Or 3 but not 15");
        }
        else{
            System.out.println("Does not satisfy condition ");
        }
    }
}