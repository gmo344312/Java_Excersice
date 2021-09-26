import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BT66 {

    public static class MyWindow extends JFrame{
        public MyWindow(){
         super("JCheckBox test");
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         JPanel pnBorder = new JPanel();
         pnBorder.setLayout(new BorderLayout());  
         
        JPanel pnCenter = new JPanel();
        pnBorder.add(pnCenter,BorderLayout.CENTER);
        JPanel pnSouth = new JPanel();
        pnBorder.add(pnSouth,BorderLayout.SOUTH);
        
        JTextField Tf1 = new JTextField("Watch the font style change");
        JCheckBox Jb1 = new JCheckBox("Bold");
        JCheckBox Jb2 = new JCheckBox("italic");
        pnCenter.add(Tf1);pnSouth.add(Jb1);pnSouth.add(Jb2);       
        //container
        getContentPane().add(pnBorder);
        Jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Jb1.isSelected())
                {
                        Font f=new Font("Arial",Font.BOLD,14);
                        Tf1.setFont(f);
                }
                else if(Jb2.isSelected())
                        {
                                Font f=new Font("Arial",Font.ITALIC,14);
                                Tf1.setFont(f);
                        }
            }
            });
        
        Jb2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(Jb2.isSelected())
                        {
                                Font f=new Font("Arial",Font.ITALIC,14);
                                Tf1.setFont(f);
                        }
                        else
                        {
                                Font f=new Font("Arial",1,14);
                                Tf1.setFont(f);
                        }
                    }
                    }); 
                        }
                }
 
        public static void main(String[] args) {
            MyWindow ui= new MyWindow();
             ui.setSize(450,150);
             //Vị trí
            ui.setLocationRelativeTo(null);
            //cho hien thi
            ui.setVisible(true);
        }
     }