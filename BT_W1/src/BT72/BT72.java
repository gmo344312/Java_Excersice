package BT72;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class BT72 extends JFrame{
    JComboBox<String> cmd;
    JLabel lbl;
    
    private void addControls(){
        Container con= getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        String []arr={"hinh1","hinh2","hinh3"};
        cmd=new JComboBox<>(arr);
        con.add(cmd);
        
        lbl=new JLabel();
        ImageIcon icon=new ImageIcon("src\\bai13\\Picture\\ii.jpg");
        lbl.setIcon(icon);
        con.add(lbl);
    }
    private void addEvents(){
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = cmd.getSelectedIndex();
                if (i == 0) {
                    ImageIcon icon = new ImageIcon("src\\bai13\\Picture\\sn.jpg");
                    lbl.setIcon(icon);
                } else if (i == 1) {
                    ImageIcon icon = new ImageIcon("src\\bai13\\Picture\\tt.jpg");
                    lbl.setIcon(icon);
                } else {
                    ImageIcon icon = new ImageIcon("src\\bai13\\Picture\\u.jpg");
                    lbl.setIcon(icon);
                }
            }
        });
    }
    public BT72(){
        super("Test icon");
        addControls();
        addEvents();
    }
    public static void main(String[] args) {
        BT72 te=new BT72();
        te.setSize(400,300);
        te.setLocationRelativeTo(null);
        te.setVisible(true);
        
    }
    
}
