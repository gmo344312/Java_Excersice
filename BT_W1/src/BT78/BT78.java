
package BT78;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class BT78 {

    private JFrame frame;
    private JTextField txt1, txt2, txt3;
    DefaultTableModel dtm;
    JTable tb;
    public static ArrayList<BT78_Ov> ds = new ArrayList<>();

    protected void loadData() {
        dtm.setRowCount(0);
        for (BT78_Ov ki : ds) {
            Vector<Object> vec = new Vector<>();
            vec.add(ki.getFirstName());
            vec.add(ki.getLastName());
            vec.add(ki.getYears());

            dtm.addRow(vec);
        }
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 515);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblAcountNumber = new JLabel("Account Number");
        lblAcountNumber.setBounds(10, 11, 144, 26);
        frame.getContentPane().add(lblAcountNumber);
        
        txt1 = new JTextField();
        txt1.setBounds(164, 11, 260, 23);
        txt1.setColumns(10);
        frame.getContentPane().add(txt1);
        
        JLabel lblAccountName = new JLabel("Account Name");
        lblAccountName.setBounds(10, 48, 144, 26);
        frame.getContentPane().add(lblAccountName);

        txt2 = new JTextField();
        txt2.setBounds(164, 48, 260, 23);
        txt2.setColumns(10);
        frame.getContentPane().add(txt2);

        JLabel lblAccountMoney = new JLabel("Account Money");
        lblAccountMoney.setBounds(10, 85, 144, 26);
        frame.getContentPane().add(lblAccountMoney);

        txt3 = new JTextField();
        txt3.setBounds(164, 85, 260, 23);
        txt3.setColumns(10);
        frame.getContentPane().add(txt3);
        
        
        

        JPanel panel = new JPanel();
        panel.setBounds(10, 122, 414, 284);
        panel.setLayout(new BorderLayout());

        dtm = new DefaultTableModel();
        dtm.addColumn("Acc Name");
        dtm.addColumn("Acc Number");
        dtm.addColumn("Acc Money");
        tb = new JTable(dtm);

        JScrollPane sc = new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add((sc), BorderLayout.CENTER);
        frame.getContentPane().add(panel);

        JButton btNewButton = new JButton("Add");
        btNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                BT78_Ov ki = new BT78_Ov();
                ki.setFirstName(txt1.getText());
                ki.setLastName(txt2.getText());
                ki.setYears(txt3.getText());
                ds.add(ki);
                loadData();
            }
        });
        btNewButton.setBounds(82, 417, 89, 48);
        frame.getContentPane().add(btNewButton);

        JButton btClear = new JButton("Clear");
        btClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //To change body of generated methods, choose Tools | Templates.
                int row = tb.getSelectedRow();
                if (row == -1) {
                    return;
                } else {
                    ds.remove(row);
                }
                loadData();
            }
        });
        btClear.setBounds(181, 417, 89, 48);
        frame.getContentPane().add(btClear);

        JButton btExit = new JButton("Exit");
        btExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //To change body of generated methods, choose Tools | Templates.
                System.exit(0);
            }
        });
        btExit.setBounds(280, 417, 89, 48);
        frame.getContentPane().add(btExit);
    }

    public BT78() {
        initialize();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //To change body of generated methods, choose Tools | Templates.
                try {
                    BT78 window = new BT78();
                    window.frame.setVisible(true);
                    window.frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();

                }

            }
        });
    }
}
