import java.util.*;
public class Assingment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("--- Welcome to BaseCase Shop---");
        System.out.print("How many items do you want to purchase? ");
        int n=sc.nextInt();
        sc.nextLine(); 
        if(n>5){
            System.out.println("Maximum limit is 5");
            n=5;
            System.out.println("So Final numbeer of item " + n );
        }
        String[] productname = new String[n];
        double[] price=new double[n];
        int[] quantities=new int[n];

        for (int i=0;i<n;i++) {
            System.out.print("Enter Product " + (i + 1) + " Name: ");
            productname[i] = sc.nextLine();
            System.out.print("Enter Price: ");
            price[i] = sc.nextDouble();
             if(price[i] <= 0)
             {
                System.out.println("Error");
              i--;sc.nextLine(); 
                continue;
             }
            System.out.print("Enter Quantity: ");
            quantities[i] = sc.nextInt(); 
             if(quantities[i] <= 0)
             {
                System.out.println("Error");
             i--; sc.nextLine(); 
                continue;
             }

            System.out.println("                  ");
            
            sc.nextLine(); 
        }

        System.out.println("**********");
        System.out.println("                      ");
        System.out.println("--- Final Receipt---");
        double subtotal=0;

        for (int i = 0; i < n; i++) {
          double itemtotal=price[i]*quantities[i];
           subtotal = subtotal + itemtotal;
        }

        double discount;
        if (subtotal >100) {
         discount=subtotal * 0.20;
        }
         else if (subtotal>50) {
         discount=subtotal*0.10;
        } 
        else {
         discount=subtotal*0.05;
        }
        double deliveryfee = (subtotal < 50) ? 10 : 0;
        double Finaltotal = subtotal - discount + deliveryfee;
         for (int i=0;i<n;i++){
            double It=price[i]*quantities[i];
            System.out.println("Item " +(i+1)+":"+ productname[i]+
                    " - " + quantities[i] + " x " + price[i] +
                    " = " + It);
         }
         System.out.println("                  ");

        System.out.println("Subtotal :"+ subtotal);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Delivery Fee :"+ deliveryfee);
        System.out.println("                    ");
        System.out.println("Final Total :"+ Finaltotal);
        System.out.println("------------------------------------------");



    }
    
}
