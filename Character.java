
import java.util.Scanner;

public class Character{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch=sc.next().charAt(0);
        if(ch>='0' && ch<='9'){
            System.out.println("Character is digit");
        }
        else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("Character is Alphabet");
        }
        else{
            System.out.println("Special Character");
        }
    }
}