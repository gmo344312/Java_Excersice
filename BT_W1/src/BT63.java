import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BT63 {

    public static class MyWindow extends JFrame{
        public MyWindow(){
         super("MyWindow");
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.BLUE);

        JButton bt1= new JButton("FlowLayout");
        JButton bt2= new JButton("Add các control");
        JButton bt3= new JButton("Trên 1 dòng");
        JButton bt4= new JButton("Hết chỗ chứa");
        JButton bt5= new JButton("Thì xuống dòng");

       pnFlow.add(bt1); 
       pnFlow.add(bt2);
       pnFlow.add(bt3);
       pnFlow.add(bt4);
       pnFlow.add(bt5);
       Container con= getContentPane();
       con.add(pnFlow);
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