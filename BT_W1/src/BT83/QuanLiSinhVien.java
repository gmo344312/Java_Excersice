
package BT83;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class QuanLiSinhVien {
    private JFrame frame;
    private JTextField txtMa, txtTen;

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 561, 504);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.WEST);

        JPanel panel1 = new JPanel();
        frame.getContentPane().add(panel1, BorderLayout.CENTER);

        Dimension minimumSize = new Dimension(200, 100);
        panel.setMinimumSize(minimumSize);
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel, panel1);
        panel1.setLayout(null);

        JLabel lblN = new JLabel("Mã Sv: ");
        Font f = new Font("Tahoma", Font.BOLD, 12);
        lblN.setFont(f);
        lblN.setBounds(10, 11, 92, 28);
        panel1.add(lblN);
        txtMa = new JTextField();
        txtMa.setFont(f);
        txtMa.setBounds(112, 11, 214, 28);
        panel1.add(txtMa);
        txtMa.setColumns(10);

        JLabel lblHT = new JLabel("Họ và Tên");
        lblHT.setFont(f);
        lblHT.setBounds(10, 55, 92, 28);
        panel1.add(lblHT);
        txtTen = new JTextField();
        txtTen.setFont(f);
        txtTen.setBounds(112, 55, 216, 28);
        txtTen.setColumns(10);
        panel1.add(txtTen);

        JLabel lblGT = new JLabel("Giới tính");
        lblGT.setFont(f);
        lblGT.setBounds(10, 94, 92, 28);
        panel1.add(lblGT);
        JCheckBox checkBox = new JCheckBox("Nam");
        checkBox.setFont(f);
        checkBox.setBounds(112, 90, 97, 32);
        panel1.add(checkBox);

        
        JTree tree = new JTree();

        
        JButton btAdd = new JButton("Thêm");
        btAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sinhvien sv = new Sinhvien();
                sv.setMa(txtMa.getText());
                sv.setTen(txtTen.getText());
                if (checkBox.isSelected()) {
                    sv.setGt("Nam");
                } else {
                    sv.setGt("Nữ");
                }
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
                DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(sv);
                selectedNode.add(newNode);
                DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
                model.reload();
            }
        });
        btAdd.setFont(f);
        btAdd.setBounds(39, 145, 89, 43);
        panel1.add(btAdd);

        //create delete button
        JButton btXoa = new JButton("Xoa");
        btXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
                if (selectedNode != tree.getModel().getRoot()) {
                    DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
                    model.removeNodeFromParent(selectedNode);
                    model.reload();
                }
            }
        });
        btXoa.setFont(f);
        btXoa.setBounds(168, 145, 89, 43);
        panel1.add(btXoa);
        panel1.setLayout(new BorderLayout(0, 0));

        tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Tree")));
        panel.add(tree, BorderLayout.CENTER);
        frame.getContentPane().add(sp);
    }
    public QuanLiSinhVien()
    {
        initialize();
    }
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try
                {
                    QuanLiSinhVien ui=new QuanLiSinhVien();
                    ui.frame.setVisible(true);
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}
