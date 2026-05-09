package Assignment4;
import java.util.Scanner;

public class Intro {
    public static int n;
    public static void Opening(Scanner sc){ 
        System.out.println("--- Welcome to BaseCase Shop ---");
        System.out.print("How many items do you want to purchase?");
        n=sc.nextInt();
        if(n>5){
            System.out.println("Maximum limit is 5");
            n=5;
            System.out.println("So Final numbeer of item " + n );
        }
        sc.nextLine();
    }
   
}
