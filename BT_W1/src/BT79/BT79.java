package BT79;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class BT79 {

    private JTextField txt1, txt2, txtChuan, txtLuong;
    private JFrame frame;
    DefaultTableModel dtm;
    JTable tbl;
    public static ArrayList<OV> ds = new ArrayList<>();

    protected void loadNV() {
        dtm.setRowCount(0);
        for (OV ha : ds) {
            Vector vec = new Vector<>();
            vec.add(ha.getMaNV());
            vec.add(ha.getPhanXuong());
            vec.add(ha.getSoSP());

            if (Integer.parseInt(txt2.getText()) > Integer.parseInt(txtChuan.getText()));
            {
                vec.add(("X"));
            }
            dtm.addRow(vec);
        }
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 613, 580);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNhanVienCuaTui = new JLabel("Ma nhan vien");
        lblNhanVienCuaTui.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNhanVienCuaTui.setBounds(10, 11, 183, 35);
        frame.getContentPane().add(lblNhanVienCuaTui);

        // tạo thanh JFT nhập mã nhân viên
        txt1 = new JTextField();
        txt1.setFont(new Font("Tahoma", Font.BOLD, 14));
        txt1.setBounds(203, 11, 384, 35);
        txt1.setColumns(10);
        frame.getContentPane().add(txt1);

        // khởi tạo JLABEL nhập số sản phẩm
        JLabel lblSoSanPham = new JLabel("Nhập số sản phẩm: ");
        lblSoSanPham.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblSoSanPham.setBounds(10, 57, 183, 35);
        frame.getContentPane().add(lblSoSanPham);

        // tạo thanh JFT nhập số sản phẩm
        txt2 = new JTextField();
        txt2.setFont(new Font("Tahoma", Font.BOLD, 14));
        txt2.setBounds(203, 57, 384, 35);
        txt2.setColumns(10);
        frame.getContentPane().add(txt2);

        // khởi tạo JLable phân xưởng 
        JLabel lblPhanXuong = new JLabel("Phân xưởng: ");
        lblPhanXuong.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPhanXuong.setBounds(10, 103, 111, 35);
        frame.getContentPane().add(lblPhanXuong);

        // tạo menu phân xưởng ================================================================================
        JComboBox comboBox = new JComboBox();
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                if (comboBox.getSelectedIndex() != 0) {
                    txtChuan.setText("500");
                } else {
                    txtChuan.setText("300");
                }
            }
        });
        comboBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.

            }
        });
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"A", "B", "C", "D"}));
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox.setBounds(116, 103, 111, 29);
        frame.getContentPane().add(comboBox);

        // khởi tạo JLable chuẩn
        JLabel lblChuan = new JLabel("Số sản phẩm chuẩn: ");
        lblChuan.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblChuan.setBounds(247, 103, 183, 35);
        frame.getContentPane().add(lblChuan);

        // tạo thanh JFT nhập số sản phẩm chuẩn
        txtChuan = new JTextField();
        txtChuan.setText("300");
        txtChuan.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtChuan.setBounds(450, 103, 104, 35);
        frame.getContentPane().add(txtChuan);
        txtChuan.setColumns(10);

        // tạo JLable tiên lương
        JLabel lblLuong = new JLabel();
        lblLuong.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblLuong.setBounds(10, 149, 183, 35);
        frame.getContentPane().add(lblLuong);

        // tạo tạo dòng xuất lương
        txtLuong = new JTextField();
        txtLuong.setBackground(Color.CYAN);
        txtLuong.setHorizontalAlignment(SwingConstants.CENTER);
        txtLuong.setEnabled(false);
        txtLuong.setForeground(Color.CYAN);
        txtLuong.setFont(new Font("Tahoma", Font.BOLD, 20));
        txtLuong.setBounds(203, 149, 384, 35);
        frame.getContentPane().add(txtLuong);

        // Tạo Button tính lương và tính lương nhân viên=======================================================
        JButton btnTinhLuong = new JButton("Tính Lương ");
        btnTinhLuong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e4) {
                //To change body of generated methods, choose Tools | Templates.
                if (!txt2.getText().isEmpty()) {
                    if (Integer.parseInt(txt2.getText()) <= Integer.parseInt(txtChuan.getText())) {
                        txtLuong.setText(String.valueOf(new DecimalFormat("#,###").format(30000 * (Integer.parseInt(txt2.getText())))));
                    } else {
                        txtLuong.setText(String.valueOf(new DecimalFormat("#,###").format((20000 * (Integer.parseInt(txt2.getText()) - Integer.parseInt(txtChuan.getText()) + 30000 * (Integer.parseInt(txt2.getText())))))));
                    }
                }
            }
        });
        btnTinhLuong.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnTinhLuong.setBounds(10, 198, 111, 47);
        frame.getContentPane().add(btnTinhLuong);

        // Tạo button THÊM --------------------------------------------------------
        JButton btnAdd = new JButton("Thêm");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e0) {
                //To change body of generated methods, choose Tools | Templates.
                if (!txt2.getText().isEmpty()) {
                    OV nV = new OV();
                    nV.setMaNV(txt1.getText());
                    nV.setPhanXuong((String) comboBox.getSelectedItem());
                    nV.setSoSP(Integer.parseInt(txt2.getText()));
                    ds.add(nV);
                    loadNV();

                }
            }
        });
        btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnAdd.setBounds(131, 198, 111, 47);
        frame.getContentPane().add(btnAdd);

        // Tạo button Xoá --------------------------------------------------------
        JButton btnRemove = new JButton("Xoá");
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {
                //To change body of generated methods, choose Tools | Templates.
                int row = tbl.getSelectedRow();
                if (row == -1) {
                    return;
                } else {
                    ds.remove(row);
                }
                loadNV();

            }
        });
        btnRemove.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnRemove.setBounds(373, 198, 111, 47);
        frame.getContentPane().add(btnRemove);
        // Tạo button Xoá --------------------------------------------------------
        JButton btnFix = new JButton("Sữa");
        btnFix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e2) {
                //To change body of generated methods, choose Tools | Templates.
                int row = tbl.getSelectedColumn();
                if (row == -1) {

                    return;
                } else {
                    OV nV = new OV();
                    nV.setMaNV(txt1.getText());
                    nV.setPhanXuong((String) comboBox.getSelectedItem());
                    nV.setSoSP(Integer.parseInt(txt2.getText()));
                    ds.add(row, nV);
                    ds.remove(row + 1);

                }
                loadNV();
            }
        });
        btnFix.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnFix.setBounds(252, 198, 111, 47);
        frame.getContentPane().add(btnFix);

        // tạo button đóng==================================================
        JButton btnClose = new JButton("Thoát");
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                System.exit(0);
            }
        });
        btnClose.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnClose.setBounds(486, 198, 111, 47);
        frame.getContentPane().add(btnClose);
        // tạo bảNG ==================================================

        JPanel pn = new JPanel();
        pn.setBounds(10, 256, 577, 274);
        pn.setLayout(new BorderLayout());
        dtm = new DefaultTableModel();
        dtm.addColumn("Mã nhân viên");
        dtm.addColumn("Phân xưởng");
        dtm.addColumn("Số sản phẩm");
        dtm.addColumn("Vượt chuẩn");
        tbl = new JTable(dtm);
        pn.setLayout(new BorderLayout());

        // thanh trượt cho tbl
        JScrollPane sc = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pn.add((sc), BorderLayout.CENTER);
        frame.getContentPane().add(pn);

    }

    public BT79() {
        initialize();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //To change body of generated methods, choose Tools | Templates.

                try {
                    BT79 hui = new BT79();
                    hui.frame.setVisible(true);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }

            }
        });
    }
}
