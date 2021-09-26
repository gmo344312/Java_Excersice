package BT73;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;


public class window2 extends JFrame{
    public static DefaultListModel<String> model;
    JList<String> lst;
    JButton btThem,btXoa;
    
    private void addControls()
    {
        Container con=getContentPane();
        con.setLayout(new BorderLayout());
        
        JPanel pnTop=new JPanel();
        pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        btThem=new JButton("Add Philosopher");
        pnTop.add(btThem);
        btXoa=new JButton("Remove Selected Philosopher");
        pnTop.add(btXoa);
        con.add(pnTop,BorderLayout.NORTH);
        
        model=new DefaultListModel<>();
        model.addElement("Plato");
        model.addElement("Arisotle");
        lst=new JList<>(model);
        lst.setVisibleRowCount(5);
        lst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane sc=new JScrollPane(lst, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        con.add(sc,BorderLayout.CENTER);
        
    }
    private void addEvents(){
        btXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            int k=lst.getSelectedIndex();
            if(k!=-1)
            {
                ((DefaultListModel) lst.getModel()).remove(k);
            }
            }
        });
         btThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window1 me=new window1("Input");
                me.showWindow();
            }
    });
}
    public window2()
    {
        super("Test");
        addControls();
        addEvents();
    }
    public static void main(String[] args) {
        window2 ca=new window2();
        ca.setSize(400, 300);
        ca.setLocationRelativeTo(null);
        ca.setVisible(true);
    }
}
