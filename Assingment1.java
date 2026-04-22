import java.util.*;
public class Assingment1 {
    public static void main(String[] args) {
        System.out.println("--- Welcome to the Tamal Shop--");
       Scanner sc =new Scanner(System.in);

        
        System.out.print("Enter Product Name :" );
        String pn=sc.nextLine();

       System.out.print("Entwer unit price :");
       double up = sc.nextDouble();
        
       System.out.print("Enter Quantity :");
       int q=sc.nextInt();
      double Subtotal=up*q;
      double Discount =Subtotal*(.15);
      double total =Subtotal-Discount;
      int rt=(int)Math.floor(total);


       System.out.println("--- Final Receipt---");

       System.out.println("Itaem :" +pn);
       System.out.println("Subtotaal : $"+ Subtotal);
       System.out.println("Discount Applied :  $"+ Discount);
       System.out.println("Total (Rounded Down) :  $" + rt);
       System.out.println("-----------------------------");



    }
}
