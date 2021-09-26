import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BT65 {

    public static class MyWindow extends JFrame{
        public MyWindow(){
         super("MyWindow");
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        
        JPanel pnNorth = new JPanel();
        pnNorth.setBackground(Color.red);
        pnBorder.add(pnNorth,BorderLayout.NORTH);
        
        JPanel pnSouth = new JPanel();
        pnSouth.setBackground(Color.red);
        pnBorder.add(pnSouth,BorderLayout.SOUTH);
        
        JPanel pnWest = new JPanel();
        pnWest.setBackground(Color.blue);
        pnBorder.add(pnWest,BorderLayout.WEST);
        
        JPanel pnEast = new JPanel();
        pnEast.setBackground(Color.blue);
        pnBorder.add(pnEast,BorderLayout.EAST);
        
        JPanel pnCenter = new JPanel();
        pnCenter.setBackground(Color.yellow);
        pnBorder.add(pnCenter,BorderLayout.CENTER);
        
        //container
        getContentPane().add(pnBorder);
        }

        public static void main(String[] args) {
            MyWindow ui= new MyWindow();
             ui.setSize(400,300);
        ui.setLocationRelativeTo(null);
        //cho hien thi
        ui.setVisible(true);
        }
     }
}