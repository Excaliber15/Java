
import java.util.Scanner;

public class ProfitLoss{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        int cp=sc.nextInt();
        System.out.print("Enter the selling price: ");
        int sp=sc.nextInt();
        if(sp>cp){
            System.out.println("Profit by " + (sp-cp));
        }
        else if(sp==cp){
            System.out.println("No Profit/ No loss");
        }
        else{ // cp>sp
            System.out.println("Loss By "+ (cp-sp));
        }
    }
}