
import java.util.Scanner;

public class ProfitLossPer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double cp=sc.nextDouble();
        System.out.print("Enter selling price: ");
        double sp=sc.nextDouble();
        if(sp>cp){
            System.out.println("Profit By "+(sp-cp)/(cp)*100+"%");
        }
        else if(sp==cp){
            System.out.println("No profit/No lOSS");
        }
        else{
            // cp>sp
            System.out.println("Loss by "+(cp-sp)/(cp)*100+"%");
        }
    }
}
