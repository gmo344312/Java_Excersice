import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class BT68 extends JFrame{
            JTextField txA,txB,txC,txKQ;
            JButton btnXoa,btnGiai,btnThoat;
            private void addControl(){
                Container c =getContentPane();
                c.setLayout(new BorderLayout());
                JPanel pnTop = new JPanel();
                JLabel lbltile = new JLabel("Giai PT bậc 2");
                Font ft = new Font("Arial",Font.BOLD,25 );
                lbltile.setFont(ft);
                lbltile.setForeground(Color.black);
                pnTop.setBackground(Color.GRAY);
                pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
                pnTop.add(lbltile);
                c.add(pnTop,BorderLayout.NORTH);
                JPanel pnCenter = new JPanel();
                pnCenter.setLayout(new BoxLayout(pnCenter,BoxLayout.Y_AXIS));
                c.add(pnCenter,BorderLayout.CENTER);
                
                JPanel pnA =new JPanel();
                pnA.setLayout(new FlowLayout(FlowLayout.CENTER));
                JLabel lblA=new JLabel("A: ");
                Font ftLabel = new Font("Arial",Font.BOLD,20);
                lblA.setFont(ftLabel);
                txA = new JTextField(15);
                pnA.add(lblA);
                pnA.add(txA);
                pnCenter.add(pnA);
                
                JPanel pnB =new JPanel();
                pnB.setLayout(new FlowLayout(FlowLayout.CENTER));
                JLabel lblB=new JLabel("B: ");
                lblB.setFont(ftLabel);
                txB = new JTextField(15);
                pnB.add(lblB);
                pnB.add(txB);
                pnCenter.add(pnB);
                
                JPanel pnC=new JPanel();
                pnC.setLayout(new FlowLayout(FlowLayout.CENTER));
                JLabel lblC=new JLabel("C: ");
                lblC.setFont(ftLabel);
                txC = new JTextField(15);
                pnC.add(lblC);
                pnC.add(txC);
                pnCenter.add(pnC);
                
                JPanel pnKQ = new JPanel();
                pnKQ.setLayout(new FlowLayout(FlowLayout.CENTER));
                JLabel lblKQ= new JLabel("Ket qua: ");
                lblKQ.setFont(ftLabel);
                pnKQ.add(lblKQ);
                pnCenter.add(pnKQ);
                
                JPanel pnOutput = new JPanel();
                txKQ = new JTextField(20);
                txKQ.setEnabled(false);
                txKQ.setHorizontalAlignment(SwingConstants.CENTER);
                txKQ.setBackground(Color.white);
                pnOutput.add(txKQ);
                pnCenter.add(pnOutput);
                 
                TitledBorder boderCenter = new TitledBorder(BorderFactory.createLineBorder(Color.red),"Nhap a,b,c");
                btnGiai=new JButton("Giai");
                btnXoa =new JButton("Xoa");
                btnThoat=new JButton("Thoat");
                
                TitledBorder borderbot = new TitledBorder(BorderFactory.createLineBorder(Color.yellow),"Chon Thao Tac: ");
                JPanel pnBot = new JPanel();
                pnBot.setLayout(new FlowLayout(FlowLayout.CENTER));
                pnBot.add(btnGiai);
                pnBot.add(btnXoa);
                pnBot.add(btnThoat);              
                pnBot.setBorder(borderbot);
                pnCenter.setBorder(borderbot);
                c.add(pnBot,BorderLayout.SOUTH);   
            }
                
            private void addEvents() {
            btnThoat.addMouseListener(new MouseListener() {
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

        btnXoa.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
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
        btnGiai.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                try {
                    double a = Double.parseDouble(txA.getText());
                    double b = Double.parseDouble(txB.getText());
                    double c = Double.parseDouble(txC.getText());
                    double delta = b * b - 4 * a * c;
                    double x1, x2;
                    if (delta > 0) {
                        x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
                        x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
                        txKQ.setText("x1= " + x1 + "va x2= " + x2);
                    } else if (delta == 0) {
                        x1 = (-b / (2 * a));
                        txKQ.setText("x1=x2" + x1);
                    } else {
                        txKQ.setText("Phuong trinh vo nghiem");
                    }
                } catch (Exception e3) {
                    JOptionPane.showMessageDialog(null, "Input không hợp lệ");
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
        public BT68(){
            super("Giai PT bac65 2");
            addControl();
            addEvents();
        }
        public static void main(String[] args) {
            BT68 ui= new BT68();
            //kich thuoc window
             ui.setSize(450,400);
             //Vị trí
            ui.setLocationRelativeTo(null);
            //cho hien thi
            ui.setVisible(true);
        }
}

     
               