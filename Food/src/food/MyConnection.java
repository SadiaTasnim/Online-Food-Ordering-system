//Here we've imported here all the necessary packages
package food;
import java.sql.Connection;
import java.sql.DriverManager;

/*We want to run SQL code so we've set up a connection to each server we want 
to work with*/
public class MyConnection {
    public static void main(String[] args){
        getConnection();
    }
    //Here we've created a connection to connect with MYSQL database
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mydb","root","");
            System.out.println("connected");
        }catch(Exception ex){
        System.out.println(ex);
        }
        return con;
        
    }
   
}
