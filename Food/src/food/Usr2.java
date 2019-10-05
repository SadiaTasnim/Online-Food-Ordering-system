package food;

/*Here we've created a user class named "Usr2" which is a reference of table 
named "cart" in MySQL database and this class will also refer the JFRAME 
named "MyFrame2"*/
public class Usr2 {
    private int no,quantity;
    private String foodname,price;
    //Constructor
    public Usr2(int no,String foodname,int quantity,String price){
        this.no=no;
        this.foodname=foodname;
        this.quantity=quantity;
        this.price=price;
    }
     //Here we've used four get methods
    public int getno(){
        return no;
    }
    public String getfoodname(){
        return foodname;
    }
    public int getquantity(){
        return quantity;
    }
    public String getprice(){
        return price;
    }
    
}
