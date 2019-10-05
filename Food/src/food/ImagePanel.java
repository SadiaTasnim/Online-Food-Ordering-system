//Here we've imported here all the necessary packages
package food;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

/*Swing is a set of program components for Java programmers that provide the 
ability to create graphical user interface(GUI) components,such as buttons,labels,
text fields that are independent of the windowing system for specific operating 
system.Swing components are used with the Java Foundation Classes(JFC)*/
public class ImagePanel extends javax.swing.JPanel {
    private Image BackGroundimage;


public ImagePanel(){

}

    public Image getImage() {
        return BackGroundimage;
    }
    /*Here we've created a function to get the dimension of the images 
    which'll be shown in menu page*/
    
    public void setImage(Image image) {
        this.BackGroundimage = image;
   
        Dimension size=new Dimension(this.getWidth(),this.getHeight());
   
        this.setPreferredSize(size);
        this.setMinimumSize(size);
        this.setMaximumSize(size);
        this.setSize(size);
        this.setOpaque(false);
    }
   
    public static void main(String[] args) {
       
    }
    @Override
    public void paintComponent(Graphics g){
        if(this.BackGroundimage!=null){
            g.drawImage(BackGroundimage, 0, 0,this.getWidth(),this.getHeight(),null);
        }
    }
}