import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;


public class Main {
    public static void main(String[] args){
       MyFrame frame3 = new MyFrame();
//        JFrame frame4 = new JFrame();
//        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame4.setSize(500,500);
//        frame4.setVisible(true);
        //frame4.getContentPane().setBackground(new Color(44, 62, 80));  //set bg color

        JLabel label1 = new JLabel(); //create label
        label1.setText("Wake up, Neo..."); //enter text of label
        label1.setVisible(true);
        frame3.add(label1);
        label1.setForeground(new Color(0x00FF00));//changing font color
        label1.setLocation(0,0);

        ImageIcon image = new ImageIcon("i.png");
        label1.setIcon(image);


    }
}
