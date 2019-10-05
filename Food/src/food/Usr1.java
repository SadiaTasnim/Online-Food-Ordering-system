//Here we've imported here all the necessary packages
package food;

/*Here we've created a user class named "Usr1" which is a reference of table 
named "admnlogin" in MySQL database and this class will also refer the JFRAME 
named "MyFrame1"*/
public class Usr1 {
    private int no;
    private String name,password;
    //Constructor
    public Usr1(int no,String name,String password){
        this.no=no;
        this.name=name;
        this.password=password;
      
    }
     //Here we've used three get methods
    public int getno(){
        return no;
    }
    public String getname(){
        return name;
    }
    public String getpassword(){
        return password;
    }
   
    
}
