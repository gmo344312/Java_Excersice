
package BT80;


import java.awt.Container;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;


public class cai8 extends JFrame {

    private JTextField txtId, txtName;

    private JButton btnOk;

    public cai8(String title) {

        setTitle(title);

    }

    public void doShow() {

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setSize(300, 150);

        addControl();

        setLocationRelativeTo(null);
        setAlwaysOnTop(true);

        setVisible(true);

    }

    public void addControl() {

        JPanel pnBox = new JPanel();

        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));

        JPanel pnId = new JPanel();

        txtId = new JTextField(15);

        txtName = new JTextField(15);

        JLabel lblId = new JLabel("Cate Id:");

        JLabel lblName = new JLabel("Cate Name:");

        pnId.add(lblId);
        pnId.add(txtId);

        pnBox.add(pnId);

        JPanel pnName = new JPanel();

        pnName.add(lblName);

        pnName.add(txtName);

        pnBox.add(pnName);

        JPanel pnButton = new JPanel();

        btnOk = new JButton("OK");

        pnButton.add(btnOk);

        pnBox.add(pnButton);

        lblId.setPreferredSize(lblName.getPreferredSize());

        Container con = getContentPane();
        con.add(pnBox);

        btnOk.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                caixanh cate = new caixanh(txtId.getText(), txtName.getText());

                cai9.listData.addCate(cate);

                cai9.updateCateList();

                dispose();

            }

        });

    }
}
