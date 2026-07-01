
import java.util.*;

public class SumOfDigitsInString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String temp="";
        int sum=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                temp=temp+ch;
            }
            else{
                if(!temp.isEmpty()){
                    sum=sum+Integer.parseInt(temp);
                    temp="";
                }
            }
        }
        
        if(!temp.isEmpty()){
            sum=sum+Integer.parseInt(temp);
        }
        System.out.println(sum);
    }
}