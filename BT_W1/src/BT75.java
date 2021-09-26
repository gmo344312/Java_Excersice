import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.channels.Channels;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class BT75 {

    private JFrame frame;
    private JTextField txtInput;
    DefaultListModel<Double> demoList;
    JList list;
    Checkbox checkbox;
    int checkkam = 0;

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 650, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Thao tac tren List-Checkbox");
        lblNewLabel.setForeground(Color.BLUE);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 11, 614, 53);
        frame.getContentPane().add(lblNewLabel);

        JPanel panel = new JPanel();
        LineBorder linedBorder = new LineBorder(Color.RED);
        panel.setBounds(234, 87, 390, 363);
        panel.setBorder(BorderFactory.createTitledBorder(linedBorder, "Nhap thong tin"));
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JButton btNhap = new JButton("Nhap");
        btNhap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try {
                    Double d = Double.parseDouble(txtInput.getText());
                    if (checkkam % 2 == 0) {
                        demoList.addElement(Math.abs(d));
                    } else {
                        demoList.addElement(Math.abs(d) * (-1));
                    }
                } 
                catch(Exception b) 
                {
                    JOptionPane.showMessageDialog(null, "Khong phai so");
                }
                txtInput.setText("");
            }
        });
        btNhap.setBounds(10, 26, 111, 42);
        panel.add(btNhap);

        txtInput = new JTextField();
        txtInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent arg0) {

            }

        });
        txtInput.setBounds(131, 26, 137, 42);
        panel.add(txtInput);
        txtInput.setColumns(10);
        checkbox = new Checkbox("Cho am");
        checkbox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ++checkkam;
            }
        });
        checkbox.setBounds(274, 23, 95, 45);
        panel.add(checkbox);
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(10, 95, 370, 257);
        panel.add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));
        demoList = new DefaultListModel<Double>();
        list = new JList(demoList);
        panel_2.add(list, BorderLayout.CENTER);
        

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(-19, 64, 388, 363);
        panel_1.setBounds(10, 87, 216, 363);
        panel_1.setBorder(BorderFactory.createTitledBorder(linedBorder, "Chon thao tac"));
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        JButton bt1 = new JButton("To den so chan");
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                list.setBackground(Color.WHITE);
                int[] a = new int[demoList.getSize()];
                for (int i = 0; i < demoList.getSize(); i++) {
                    a[i] = -1;
                    if (demoList.get(i) % 2 == 0) {
                        a[i] = i;
                    }
                }
                list.setSelectedIndices(a);
                list.setSelectionBackground(Color.BLUE);
            }
        });
        bt1.setBounds(10, 24, 196, 42);
        panel_1.add(bt1);

        JButton bt2 = new JButton("To den so le");
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.setBackground(Color.WHITE);
                int[] a = new int[demoList.getSize()];
                for (int i = 0; i < demoList.getSize(); i++) {
                    a[i] = -1;
                    if (demoList.get(i) % 2 == 1) {
                        a[i] = i;
                    }
                }
                list.setSelectedIndices(a);
                list.setSelectionBackground(Color.BLUE);
            }
        });
        bt2.setBounds(10, 75, 196, 42);
        panel_1.add(bt2);

        JButton bt3 = new JButton("Bo to den");
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                list.setSelectionBackground(Color.WHITE);
            }
        });
        bt3.setBounds(10, 128, 196, 42);
        panel_1.add(bt3);

        JButton bt4 = new JButton("Xoa cac gia tri bi to den");
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int[] as = list.getSelectedIndices();
                int a = demoList.getSize() - 1;
                for (int i = as.length - 1; i >= 0; i--) {
                    for (int j = a; j >= 0; j--) {
                        if (j == as[i]) {
                            demoList.remove(j);
                            a = j;
                            break;
                        }
                    }

                }

            }
        });
        bt4.setBounds(10, 181, 196, 42);
        panel_1.add(bt4);

        JButton bt5 = new JButton("Tong cac gia tri ");
        bt5.setBounds(10, 234, 193, 42);
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                double d = 0;
                for (int i = 0; i < demoList.getSize(); i++) {
                    d += demoList.get(i);
                }
                JOptionPane.showMessageDialog(null, "Tong la: ");
            }
        });
        panel_1.add(bt5);
    }

    public BT75() {
        initialize();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //To change body of generated methods, choose Tools | Templates.
                try {
                    BT75 window = new BT75();
                    window.frame.setVisible(true);
                    window.frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();

                }

            }
        });
    }
}
