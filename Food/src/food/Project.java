//Here we've imported here all the necessary packages
package food;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Project extends HomeJFrame {
    JLabel pic;
    Timer tm;
    int x = 0;
    //Here we've provided the path of images in array
    String[] list = {
    "C:/Users/LENOVO/Documents/NetBeansProjects/Food/src/Slideshow/11.jpg",
        "C:/Users/LENOVO/Documents/NetBeansProjects/Food/src/Slideshow/12.jpg",
        "C:/Users/LENOVO/Documents/NetBeansProjects/Food/src/Slideshow/13.jpg",
        "C:/Users/LENOVO/Documents/NetBeansProjects/Food/src/Slideshow/14.jpg",
        "C:/Users/LENOVO/Documents/NetBeansProjects/Food/src/Slideshow/15.jpg",
        "C:/Users/LENOVO/Documents/NetBeansProjects/Food/src/Slideshow/16.jpg",
        "C:/Users/LENOVO/Documents/NetBeansProjects/Food/src/Slideshow/17.jpg",
        "C:/Users/LENOVO/Documents/NetBeansProjects/Food/src/Slideshow/18.jpg",
        "C:/Users/LENOVO/Documents/NetBeansProjects/Food/src/Slideshow/19.jpg",
        "C:/Users/LENOVO/Documents/NetBeansProjects/Food/src/Slideshow/Picture_1.jpg",
        "C:/Users/LENOVO/Documents/NetBeansProjects/Food/src/Slideshow/Picture_2.jpg",
        "C:/Users/LENOVO/Documents/NetBeansProjects/Food/src/Slideshow/Picture_3.jpg"
            
    };
    
    
     //Here we've created a class named "Project" to slideshow the images
     public Project(){
        pic = new JLabel();
        pic.setBounds(650, 250, 400, 200);

        //Here we've called the function 'SetImageSize'
        SetImageSize(6);
        //Here we've set a timer to maintain the time of slideshow of the images       
        tm = new Timer(800,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
            }
        });
        add(pic);
        tm.start();
        setLayout(null);
        setSize(1200, 800);
        getContentPane().setBackground(Color.red);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
      //Here we've created a function to resize the images
     public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }
    
}
