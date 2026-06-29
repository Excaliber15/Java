

import java.util.*;

public class SumDivisibleBy3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,x;
        while(n!=0){
            x=n%10;
            sum+=x;
            n/=10;
        }
        if(sum%3==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}