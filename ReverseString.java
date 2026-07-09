
import java.util.*;

public class ReverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        StringBuilder sb=new StringBuilder();
        
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}