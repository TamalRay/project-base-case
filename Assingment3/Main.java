package Assingment3;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Order Test --- ");
        try {
            Order o1 = new Order("Gaming Mouse", 25.75, 3);
            Order o2 = new Order("Mechanical Keyboard", 120.0, 1);

            System.out.println(o1);
            System.out.println(o2);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("--- Invalid Order Attempt ---");


    }
}
