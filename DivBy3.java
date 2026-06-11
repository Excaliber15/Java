/*  

Take an integer as input and calculaye the sum of its digits.

if the sum is divisivle by 3, print True else print False

Input: 123
Output: True

Input: 1234
Output: False


*/

import java.util.*;

public class DivBy3{
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