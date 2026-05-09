package Assignment4;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          ArrayList<Order> tamal=new ArrayList<>();
        Intro.Opening(sc);
        int i=0;
        while(i<Intro.n){
            try{
            System.out.print("Enter product " + (i+1) +" Name :");
            String name=sc.nextLine();

            System.out.print("Enter Price :" );
            double price=sc.nextDouble();
              
            System.out.print("Enter Quantity :");
            int quantity=sc.nextInt();
            sc.nextLine(); 
            System.out.println();
            
            Order order= new Order(name,price,quantity);
            tamal.add(order);
            i++;
        }
        catch(Exception e){
            System.out.println("Error is" + e.getMessage());
            i++;
            
        }       
        }
       
        System.out.println("-----Final Receipt-----");
        double subtotal=0;
        for(Order order:tamal){
            subtotal+=order.Calculatetotal();
        }
        double discountRate;
        if (subtotal > 100) {
            discountRate = 0.20;
        }
         else if (subtotal > 50) {
            discountRate = 0.10;
        } 
        else {
            discountRate = 0.05;
        }
        double discountAmount = subtotal * discountRate;

         double deliveryFee = (subtotal < 50) ? 10 : 0;
        double finalTotal = subtotal - discountAmount + deliveryFee;

        int number=1;
        for(Order order:tamal){
            System.out.println("Item " + number + ":" + order);
            number++;
        }
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount Applied: " + discountAmount);
        System.out.println("Delivery Fee: " + deliveryFee);
        System.out.println("Final Total: " + finalTotal);

        System.out.println("--------------------------");
        sc.close();

    }
    
}
