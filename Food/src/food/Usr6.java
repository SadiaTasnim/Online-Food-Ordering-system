//Here we've implemented all the necessary packages
package food;

/*Here we've created a user class named "Usr6" which is a reference of table 
named "pickup" in MySQL database and this class will also refer the JFRAME 
named "MyFrame6"*/
public class Usr6 {
    private int no;
    private String name,price,address;
    //Constructor
    public Usr6(int no,String price,String name,String address){
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
