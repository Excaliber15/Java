
import java.util.*;

public class LastCharacter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            char ch=word.charAt(word.length()-1);
            System.out.print(ch+" ");
        }
    }
}