package BT77;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class TN extends JDialog {

    JTextField txt1, txt2, txt3;
    JButton btn;

    private void Controls() {
        Container con = getContentPane();
        con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
        txt1 = new JTextField(15);
        txt2 = new JTextField(15);
        txt3 = new JTextField(15);
        btn = new JButton("Them");
        con.add(txt1);
        con.add(txt2);
        con.add(txt3);
        con.add(btn);

    }

    private void addEvents() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OV la = new OV();
                la.setFirstName(txt1.getText());
                la.setLastName(txt2.getText());
                
                la.setYears(txt3.getText());
                BT77.ds.add(la);
                BT77.loadData();
                dispose();
            }
        });
    }

    public void showWindow() {
        this.setSize(400, 350);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public TN() {
        this.setTitle("Them");
        Controls();
        addEvents();
    }

}
