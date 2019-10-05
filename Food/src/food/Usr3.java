package food;

/*Here we've created a user class named "Usr3" which is a reference of table 
named "checkout" in MySQL database and this class will also refer the JFRAME 
named "MyFrame3"*/
public class Usr3 {
    private int no;
    private String name,price,address;
    //Constructor
    public Usr3(int no,String price,String name,String address){
        this.no=no;
        this.price=price;
        this.name=name;
        this.address=address;
    }
     //Here we've used four get methods
    public int getno(){
        return no;
    }
    public String getprice(){
        return price;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    
}
