import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){

        this.setVisible(true);
        this.setSize(640,480);
        this.setTitle("The Java has you :D");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //shuting down

        this.setResizable(false);
        ImageIcon image1 = new ImageIcon("i.png");
        this.setIconImage(image1.getImage());
        this.getContentPane().setBackground(new Color(44, 62, 80));  //set bg color





    }
}
