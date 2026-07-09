/*  

Find characters of a string at odd index


INPUT : Management

OUTPUT : aaeet


*/

import java.util.*;

public class OddIndex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(i%2==1){
                System.out.print(str.charAt(i));
            }
        }
    }
}