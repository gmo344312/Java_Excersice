import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;


public class BT70 extends JFrame{
    JList<String> lst;
    JLabel lbl;
    private  void addEvents(){
        lst.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
              lbl.setText(String.valueOf(lst.getSelectedValue()));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
}
    private  void addControl(){
        Container con=getContentPane();
        con.setLayout(new BorderLayout());
        lbl=new JLabel("Ngay");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        con.add(lbl,BorderLayout.NORTH);
        DefaultListModel ngayModel=new DefaultListModel<>();
        ngayModel.addElement("Monday");
        ngayModel.addElement("Tuesday");
        ngayModel.addElement("Wednesday");
        ngayModel.addElement("Thursday");
        ngayModel.addElement("Friday");
        ngayModel.addElement("Saturday");
        ngayModel.addElement("Sunday");
        
        lst=new JList(ngayModel);
        lst.setSelectedIndex(0);
        lst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lbl.setText(String.valueOf(lst.getSelectedValue()));
        JScrollPane sc=new JScrollPane(lst,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        con.add(sc,BorderLayout.CENTER);
    }
    public BT70(){
        super("Listdemo");
        addControl();
        addEvents();
    }
    public static void main(String[] args) {
        BT70 su=new BT70();
        su.setSize(300, 150);
        su.setLocationRelativeTo(null);
        su.setVisible(true);
    }
}
