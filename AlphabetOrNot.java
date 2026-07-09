
import java.util.Scanner;

public class AlphabetOrNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ascii value: ");
        int n=sc.nextInt();
        if((n>=97 && n<=122) || (n>=65 && n<=90)){
            System.out.println("Character is alphabet "+ (char)n);
        }
        else{
            System.out.println("Character is not Alphabet: "+ (char)n);
        }
    }
}