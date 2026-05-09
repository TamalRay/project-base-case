package Assignment4;

public class Order {
    public String productname;
    private double unitprice;
    private int quantity;

    public Order(String productname,double unitprice,int quantity) throws Exception{
        if(unitprice<=0 || quantity<=0){
            throw new Exception(" " + "Invali input.");
        }
        this.productname=productname;
        this.unitprice=unitprice;
        this.quantity= quantity;

    }
    public double Calculatetotal(){
        return unitprice*quantity;
    }
    @Override
    public String toString(){
    return productname + " - " + quantity + " pcs x "
                + unitprice + " = " + Calculatetotal();
    }


    
}
