package food;

/*Here we've created a user class named "Usr5" which is a reference of table 
named "mytable1" in MySQL database and this class will also refer the JFRAME 
named "MyFrame5"*/
public class Usr5 {
    private int id;
    private String name,phn,time,guestno,date;
    //Constructor
    public Usr5(int id,String name,String phn,String time,String guestno,String date){
        this.id=id;
        this.name=name;
        this.phn=phn;
        this.time=time;
        this.guestno=guestno;
        this.date=date;
        
    }
     //Here we've used six get methods
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getphn(){
        return phn;
    }
    public String gettime(){
        return time;
    }
    public String getguestno(){
        return guestno;}
    public String getdate(){
        return date;
        
    }
    
}
