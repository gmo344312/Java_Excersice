package BT73;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class window1 extends JDialog{
    JTextField txt;
    JButton btOk, btThoat;
    
    private void addEvents()
    {
        btThoat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });
        btOk.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                window2.model.addElement(txt.getText());
            }
        });
    }
    private void addControls()
    {
        Container con=getContentPane();
        con.setLayout(new BorderLayout());
        
        JPanel pnLeft=new JPanel();
        pnLeft.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel pnHinh=new JLabel();
        pnHinh.setIcon(new ImageIcon("src\\Bai73\\Picture\\te.jpg"));
        pnLeft.add(pnHinh);
        con.add(pnLeft);
        
        JPanel pnRight=new JPanel();
        pnRight.setLayout(new BoxLayout(pnRight,BoxLayout.Y_AXIS));
        JLabel lbl=new JLabel("Enter Name");
        Font ft=new Font("Arial", Font.BOLD,24);
        lbl.setFont(ft);
        pnRight.add(lbl);
        txt=new JTextField(15);
        pnRight.add(txt);
        
        JPanel pnBut=new JPanel();
        pnLeft.setLayout(new FlowLayout(FlowLayout.CENTER));
        btOk=new JButton("OK");
        btThoat=new JButton("Thoát");
        pnBut.add(btOk);
        pnBut.add(btThoat);
        pnRight.add(pnBut);
        con.add(pnRight,BorderLayout.CENTER);
    }
    public void showWindow()
    {
        this.setSize(400, 150);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public window1(String title)
    {
        this.setTitle(title);
        addControls();
        addEvents();
    }
}
