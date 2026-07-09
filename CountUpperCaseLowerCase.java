
import java.util.*;

public class CountUpperCaseLowerCase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int u=0,l=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)) u++;
            else if(Character.isLowerCase(ch)) l++;
        }
        System.out.println("Upper Case: "+u+" Lower Case: " + l);
    }
}