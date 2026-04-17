import java.util.Scanner;

public class DivisibleBy5Or3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        if(n%5==0 || n%3==0){
            System.out.println("Divisible By 5 or 3");
        }
        else{
            System.out.println("Not Divisible by 5 or 3");
        }
    }
}