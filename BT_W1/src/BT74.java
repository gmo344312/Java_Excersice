import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.util.Collections.list;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class BT74 {
    private JFrame frame;
    private JTextField txtInput;
    
    private void initialize(){
        frame =new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0,0));
        JPanel panel=new JPanel();
        frame.getContentPane().add(panel, BorderLayout.WEST);
        
        JPanel panel_1=new JPanel();
        frame.getContentPane().add(panel_1,BorderLayout.CENTER);
        JSplitPane sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panel,panel_1);
        
        JLabel lblNewLabel =new JLabel("Input Name");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 11, 85, 20);
        panel_1.add(lblNewLabel);
        
        txtInput=new JTextField();
        txtInput.setBounds(97, 14, 178, 20);
        panel_1.add(txtInput);
        txtInput.setColumns(10);
        
        JButton btAdd=new JButton("Add Item");
        btAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            String s=txtInput.getText();
            demoList.addElement(s);
            
            }
        });
        btAdd.setBounds(10, 48, 89, 23);
        panel_1.add(btAdd);
        
        JButton btRemoveItem=new JButton("Remove Item");
        btRemoveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 //To change body of generated methods, choose Tools | Templates.
           
            
            }
        });
        
        
        btRemoveItem.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(indexOf != -1){
                    demoList.remove(indexOf);
                    indexOf=-1;
                }
            }
        });
        btRemoveItem.setBounds(107, 48, 106, 23);
        panel_1.add(btRemoveItem);
        JButton btEditItem=new JButton("Edit Item");
        btEditItem.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(indexOf != -1){
                    demoList.remove(indexOf);
                    demoList.add(indexOf,txtInput.getText());
            }
            }
        });
        btEditItem.setBounds(228, 48, 89, 23);
        panel_1.add(btEditItem);
        Dimension minimumSize=new Dimension(100,100);
        panel.setMaximumSize(minimumSize);
        
        panel.setLayout(new BorderLayout(0,0));
        demoList=new DefaultListModel<String>();
        list=new JList(demoList);
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0){
                if(list.getSelectedIndex() != -1){
                    indexOf=list.getSelectedIndex();
                    txtInput.setText(demoList.elementAt(indexOf));
                    
                }
            }
        });
        panel.add(list,BorderLayout.CENTER);
        frame.getContentPane().add(sp);
        
    }
    int indexOf;
    DefaultListModel<String> demoList;
    JList list;
    
    public BT74()
    {
        initialize();
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //To change body of generated methods, choose Tools | Templates.
                try 
                {
                    BT74 window = new BT74();
                    window.frame.setVisible(true);
                    window.frame.setLocationRelativeTo(null);
                } catch (Exception e) 
                    {
                        e.printStackTrace();

                    }
                
            }
        });
            }
}
