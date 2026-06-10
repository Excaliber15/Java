/******************************************************************************

Example:

Write a program to compute the number of spaces  in String

String Input: Hello What is your name
Output : 4

*/

import java.util.*;

public class CountSpaces{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                count++;
            }
        }
        if(count>=3){
            System.out.println(count);
        }
        else{
            System.out.println("NA");
        }
    }
}