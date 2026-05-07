package Assingment3;

public class Order {

     public String productname;  
     private double unitprice;
     private int quantity;

      public Order(String name, double unitprice, int quantity) throws Exception {
        this.productname = name;
      
        if (unitprice <= 0) {
          throw new Exception("Unit price must be greater than zero.");
        }

        if (quantity <= 0) {
         throw new Exception("Quantity must be greater than zero.");
        }
         this.unitprice = unitprice;
        this.quantity = quantity;
    }
    public void  setUnitPrice(double price) throws Exception{
         if (price<=0) {
        throw new Exception("Unit price must be greater than zero.");
        }
        this.unitprice = price;
    }
    public void setUnitQuantity(int qty)throws Exception{
         if (qty<=0) {
            throw new Exception("Unit price must be greater than zero.");
        }
        this.quantity=qty; }

    public double getTotal() {
      return unitprice * quantity;
    }
    public String toString() {
        return productname + " - " + quantity + " pcs x " + unitprice + " = " + getTotal();
    }
    
}
