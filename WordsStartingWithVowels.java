

import java.util.*;

public class WordsStartingWithVowels{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] nstr=str.split(" ");
        int count=0;
        for(int i=0;i<nstr.length;i++){
            String word=nstr[i];
            char ch=word.charAt(0);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U'){
                count++;
            }
        }
        if(count>0) System.out.println(count);
        else System.out.println("No String Found");
    }
}