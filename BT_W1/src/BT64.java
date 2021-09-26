import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BT64 {

    public static class MyWindow extends JFrame{
        public MyWindow(){
         super("MyWindow");
        JPanel pnBox = new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
        JButton btn1 = new JButton("Box Layout");
        btn1.setForeground(Color.red);
        Font font = new Font("Arial", Font.BOLD|Font.ITALIC,25);
        JButton btn2 = new JButton("X_ASIS");
        btn2.setForeground(Color.blue);
        btn2.setFont(font);pnBox.add(btn2);
        JButton btn3 = new JButton("Y_ASIS");
        btn2.setForeground(Color.orange);
        btn2.setFont(font);pnBox.add(btn3);
        Container c = getContentPane();
        c.add(pnBox);
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