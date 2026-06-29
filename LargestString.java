

import java.util.*;

public class LargestString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] temp=str.split(" ");
        String largest="";
        for(int i=0;i<temp.length;i++){
            if(temp[i].length()>largest.length()){
                largest=temp[i];
            }
        }
        System.out.println(largest);
    }
}