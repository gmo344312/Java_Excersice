import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import javax.swing.border.TitledBorder;


public class BT69 extends JFrame{
    JRadioButton rdC, rdT, rdN, rdChia;
    JTextField txtA, txtB, txtKQ;
    JButton btGiai, btXoa, btThoat;

    private void addControls() {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        
        JPanel pnTop = new JPanel();
        JLabel lbltitle = new JLabel("Cong tru nhan chia");
        Font font = new Font("Arial", Font.BOLD, 24);
        lbltitle.setFont(font);
        lbltitle.setForeground(Color.BLUE);
        
        pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnTop.add(lbltitle);
        con.add(pnTop, BorderLayout.NORTH);
        
        JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new BorderLayout());
        
        JPanel pnLeft=new JPanel();
        pnLeft.setLayout(new GridLayout(7,3));
        
        btGiai=new JButton("Giai");
        btThoat=new JButton("Thoat");
        btXoa=new JButton("Xoa");
        
        btXoa.setPreferredSize((btThoat.getPreferredSize()));
        btGiai.setPreferredSize((btThoat.getPreferredSize()));
        
        JPanel pn1=new JPanel();
        pn1.setLayout(new FlowLayout(FlowLayout.CENTER));
        pn1.add(btGiai);
        pn1.setBackground(new Color(220,220,220));
        pnLeft.add(pn1);
       
        JPanel pn2=new JPanel();
        pn2.setLayout(new FlowLayout(FlowLayout.CENTER));
        pn2.add(btThoat);
        pn2.setBackground(new Color(220,220,220));
        pnLeft.add(pn2);
        
        JPanel pn3=new JPanel();
        pn3.add(btXoa);
        pn3.setBackground(new Color(220,220,220));
        pnLeft.add(pn3); 
        pn3.setBackground(new Color(220,220,220));
         
        
        TitledBorder BorderLeft = new TitledBorder(BorderFactory.createLineBorder(Color.red), "Chon thao tac");
        pnLeft.setBorder(BorderLeft);
        pnCenter.add(pnLeft, BorderLayout.WEST);
        
        JPanel pnRight=new JPanel();
        pnRight.setLayout(new BoxLayout(pnRight,BoxLayout.Y_AXIS));
        
        JPanel pnA = new JPanel();
        pnA.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblA = new JLabel("Nhap a: ");
        txtA=new JTextField(15);
        pnA.add(lblA);
        pnA.add(txtA);
        pnRight.add(pnA);

        JPanel pnB = new JPanel();
        pnB.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblB = new JLabel("Nhap b: ");
        txtB = new JTextField(15);
        pnB.add(lblB);
        pnB.add(txtB);
        pnRight.add(pnB);

        ButtonGroup group = new ButtonGroup();

        JPanel pnGroup = new JPanel();
        pnGroup.setLayout(new BoxLayout(pnGroup, BoxLayout.Y_AXIS));
        pnGroup.setSize(new Dimension(100, 300));
        JPanel pnHang1 = new JPanel();
        pnHang1.setLayout(new FlowLayout(FlowLayout.CENTER));
        rdC = new JRadioButton("Cong");
        rdT = new JRadioButton("Tru");
        rdN =new JRadioButton("Nhan");
        rdChia=new JRadioButton("Chia");
        group.add(rdC);
        group.add(rdT);
        group.add(rdN);
        group.add(rdChia);
        
        pnHang1.add(rdC);
        pnHang1.add(rdT);
        pnGroup.add(pnHang1);
        
        JPanel pnHang2 = new JPanel();
        pnHang1.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnHang2.add(rdN);
        pnHang2.add(rdChia);
        pnGroup.add(pnHang2);
        TitledBorder BorderRight = new TitledBorder(BorderFactory.createLineBorder(Color.red), "Chon phep toan");
        pnRight.add(pnGroup);
        
        JPanel pnKQ = new JPanel();
        pnKQ.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblKQ = new JLabel("Ket qua la: ");
        txtKQ = new JTextField(15);
        pnKQ.add(lblKQ);
        pnKQ.add(txtKQ);
        pnRight.add(pnKQ);
        txtKQ.setEditable(false);
        
        TitledBorder Border1 = new TitledBorder(BorderFactory.createLineBorder(Color.BLUE), "Nhap a va b");
        pnRight.setBorder(Border1);
        pnGroup.setBorder(BorderRight);
        pnCenter.add(pnRight,BorderLayout.CENTER);
        con.add(pnLeft, BorderLayout.WEST);
        con.add(pnRight, BorderLayout.CENTER);
    }
     private void addEvents() {
        btThoat.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                System.exit(1);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {

                //To change body of generated methods, choose Tools | Templates.
            }
        });
        btXoa.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
                //To change body of generated methods, choose Tools | Templates.
            txtA.setText("");
            txtB.setText("");
            txtKQ.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });
        btGiai.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                double soA=0, soB=0;
                   
                    if (rdC.isSelected()) {
                        if(txtA.getText().isEmpty()){
                            soA=0;
                            if(txtB.getText().isEmpty()){
                                soB=0;
                            }
                            else{
                                soB=Double.parseDouble(txtB.getText());
                            }
                        }
                        else{
                            soA=Double.parseDouble(txtA.getText());
                            if(txtB.getText().isEmpty()){
                                soB=0;
                            }
                            else{
                                soB=Double.parseDouble(txtB.getText());
                            }
                        }
                        txtKQ.setText(String.valueOf(soA+soB));
                    }
                    else if(rdT.isSelected()){
                        if(txtA.getText().isEmpty()){
                            soA=0;
                            if(txtB.getText().isEmpty()){
                                soB=0;
                            }
                            else{
                                soB=Double.parseDouble(txtB.getText());
                            }
                        }
                        else{
                            soA=Double.parseDouble(txtA.getText());
                            if(txtB.getText().isEmpty()){
                                soB=0;
                            }
                            else{
                                soB=Double.parseDouble(txtB.getText());
                            }
                        }
                        txtKQ.setText(String.valueOf(soA - soB));
                    }else if(rdN.isSelected()){
                        if(txtA.getText().isEmpty()){
                            soA=0;
                            if(txtB.getText().isEmpty()){
                                soB=0;
                            }
                            else{
                                soB=Double.parseDouble(txtB.getText());
                            }
                        }
                        else {
                            soA=Double.parseDouble(txtA.getText());
                            if(txtB.getText().isEmpty()){
                                soB=0;
                            }
                            else{
                                soB=Double.parseDouble(txtB.getText());
                            }
                        
                        }
                        txtKQ.setText(String.valueOf(soA*soB));
                    }
                    else if(rdChia.isSelected()){
                        if(txtA.getText().isEmpty()){
                            soA=0;
                            if(txtB.getText().isEmpty()){
                                soB=0;
                            }
                            else{
                                soB=Double.parseDouble(txtB.getText());
                            }
                        }
                        else {
                            soA=Double.parseDouble(txtA.getText());
                            if(txtB.getText().isEmpty()){
                                soB=0;
                            }
                            else{
                                soB=Double.parseDouble(txtB.getText());
                            }
                        
                        }
                        txtKQ.setText(String.valueOf(soA/soB));
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Chua chon phep tinh");
                    }
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
     public BT69(){
         super("Cong tru nhan chia");
         addControls();
         addEvents();
     }
     public static void main(String[] args) {
        BT69 bo=new BT69();
        bo.setSize(400, 300);
        bo.setLocationRelativeTo(null);
        bo.setVisible(true);
    }
     
}
