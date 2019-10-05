package food;

/*Here we've created a user class named "Usr4" which is a reference of table 
named "mytable" in MySQL database and this class will also refer the JFRAME 
named "MyFrame4"*/
public class Usr4 {
    private int ID;
    private String u_firstname,u_lastname,u_username,u_userpass,u_birthdate,u_useraddress;
    
    //Constructor
    public Usr4(int ID,String u_firstname,String u_lastname,String u_username,String u_userpass,String u_birthdate,String u_useraddress){
        this.ID=ID;
        this.u_firstname=u_firstname;
        this.u_lastname=u_lastname;
        this.u_username=u_username;
        this.u_userpass=u_userpass;
        this.u_birthdate=u_birthdate;
        this.u_useraddress=u_useraddress;
    }
     //Here we've used seven get methods
    public int getID(){
        return ID;
    }
    public String getu_firstname(){
        return u_firstname;
    }
    public String getu_lastname(){
        return u_lastname;
    }
    public String getu_username(){
        return u_username;
    }
    public String getu_userpass(){
        return u_userpass;
    }
    public String getu_birthdate(){
        return u_birthdate;
    }
    public String getu_useraddress(){
        return u_useraddress;
    }
    
    
}
