package BT77;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class BT77 extends JFrame {

    JButton btThem, btXoa;
    static DefaultTableModel dtm;
    JTable tb;
    public static ArrayList<OV> ds = new ArrayList<>();

    private void addControls() {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        JPanel pnTop = new JPanel();
        con.add(pnTop, BorderLayout.NORTH);
        btThem = new JButton("add philosopher");
        pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnTop.add(btThem);

        btXoa = new JButton("remove selected philosopher");
        pnTop.add(btXoa);

        JPanel pnMid = new JPanel();
        con.add(pnMid, BorderLayout.CENTER);
        dtm = new DefaultTableModel();
        dtm.addColumn("First Name");
        dtm.addColumn("Last Name");
        dtm.addColumn("Years");
        tb = new JTable(dtm);
        pnMid.setLayout(new BorderLayout());
        JScrollPane sc = new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnMid.add(sc, BorderLayout.CENTER);
    }

    protected static void loadData() {
        dtm.setRowCount(0);
        for (OV la : ds) {
            Vector<Object> vec = new Vector<>();
            vec.add(la.getFirstName());
            vec.add(la.getLastName());
            vec.add(la.getYears());

            dtm.addRow(vec);
        }
    }

    private void addEvents() {
        btThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TN ca = new TN();
                ca.showWindow();
                loadData();
            }
        });
        btXoa.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int row = tb.getSelectedRow();
                if (row ==-1) {
                    return;
                } else {
                    ds.remove(row);
                }
                loadData();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public BT77() {
        super("Test");
        addControls();
        addEvents();
    }

    public static void main(String[] args) {
        BT77 to = new BT77();
        to.setSize(400, 350);
        to.setLocationRelativeTo(null);
        to.setVisible(true);
    }

}
