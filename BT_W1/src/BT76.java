import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BT76{

private JFrame frame;
    JPanel pn;
    JLabel lbl, lbl_1, lbl_2, lbnl_3;
    JSlider  sld_1, sld_2,sld;

    
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        // sld=============================================
        sld = new JSlider(JSlider.HORIZONTAL, 0, 255, 25);
        sld.addMouseListener(new MouseAdapter() {
            @Override
        public void mouseReleased(MouseEvent arg0) {
                lbl_2.setText("RED lên" + sld.getValue());
                pn.setBackground(new Color(sld.getValue(), sld_1.getValue(), sld_2.getValue()));
            }
        });
        sld.setMinorTickSpacing(5);
        sld.setMajorTickSpacing(55);
 
        sld.setPaintTicks(true);
        sld.setPaintLabels(true);
        ////=========================
        sld.setMaximum(255);
        sld.setBounds(10, 32, 200, 40);
        frame.getContentPane().add(sld);
        
        
        // sld1 ================================
        sld_1 = new JSlider(JSlider.HORIZONTAL, 0, 255,25);
        sld_1.addMouseListener(new MouseAdapter() {
            @Override
        public void mouseReleased(MouseEvent e) {
                lbl.setText("Blue lên" + sld_1.getValue());
                pn.setBackground(new Color(sld.getValue(), sld_1.getValue(), sld_2.getValue()));
                
            }
        });
        sld_1.setMinorTickSpacing(5);
        sld_1.setMajorTickSpacing(55);
 
        sld_1.setPaintTicks(true);
        sld_1.setPaintLabels(true);
        ////=========================
        sld_1.setBounds(15, 112, 200, 40);
        frame.getContentPane().add(sld_1);

        // sld2 ================================
        sld_2 = new JSlider(JSlider.HORIZONTAL, 0, 255, 25);
        sld_2.addMouseListener(new MouseAdapter() {
            @Override
        public void mouseReleased(MouseEvent e) {
                lbl_1.setText("Grenn lên" + sld_2.getValue());
                pn.setBackground(new Color(sld.getValue(), sld_1.getValue(), sld_2.getValue()));
            }
        });
        sld_2.setMinorTickSpacing(5);
        sld_2.setMajorTickSpacing(55);
 
        sld_2.setPaintTicks(true);
        sld_2.setPaintLabels(true);
        ////=========================
        sld_2.setBounds(10, 198, 200, 40);
        frame.getContentPane().add(sld_2);
         
        pn = new JPanel();
        pn.setBounds(250, 60, 130, 130);
        frame.getContentPane().add(pn);

        lbl_2 = new JLabel("Red");
        lbl_2.setBounds(10, 11, 93, 20);
        
        frame.getContentPane().add(lbl_2);

        lbl = new JLabel("Blue");
        lbl.setBounds(10, 83, 93, 20);
        frame.getContentPane().add(lbl);

        lbl_1 = new JLabel("Green");
        lbl_1.setBounds(10, 163, 93, 20);
        frame.getContentPane().add(lbl_1);

        pn.setBackground(new Color(sld.getValue(), sld_1.getValue(), sld_2.getValue()));
    }

    public BT76() {
        initialize();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
        public void run() {
                try {
                    BT76 window = new BT76();
                    window.frame.setVisible(true);
                    window.frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
