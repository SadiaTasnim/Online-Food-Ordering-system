//Here we've imported here all the necessary packages
package food;

/*Here we've created a user class named "Usr" which is a reference of table 
named "feedback" in MySQL database and this class will also refer the JFRAME 
named "MyFrame"*/
class Usr {
    private int no;
    private String name,service,comment;
    //Constructor
    public Usr(int no,String name,String service,String comment){
        this.no=no;
        this.name=name;
        this.service=service;
        this.comment=comment;
    }
    //Here we've used four get methods
    public int getno(){
        return no;
    }
    public String getname(){
        return name;
    }
    public String getservice(){
        return service;
    }
    public String getcomment(){
        return comment;
    }
    
}
