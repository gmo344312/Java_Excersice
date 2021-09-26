
package BT87;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class BT87 extends JFrame {

    private static final long serialVersionUID = 1L;
    Timer timer;
    private int pos = 0;


    private void addControl() {
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        JButton btnBrowser = new JButton("Browser");
        JButton btnStart = new JButton("Start");
        JButton btnStop = new JButton("Stop");
        pnNorth.add(btnBrowser);
        pnNorth.add(btnStart);
        pnNorth.add(btnStop);
        pnBorder.add(pnNorth, BorderLayout.NORTH);
        
        final JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new CardLayout());
        pnBorder.add(pnCenter, BorderLayout.CENTER);
        pnCenter.setBackground(Color.RED);
        
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                timer.start();
                timer.addActionListener(new TimerPanel(pnCenter));
            }
        });
        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                timer.stop();
            }
        });
        btnBrowser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JFileChooser jfc = new JFileChooser();
                jfc.setMultiSelectionEnabled(true);
                if (jfc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
                    File[] files=jfc.getSelectedFiles();
                    for (int i = 0; i < files.length; i++) {
                          ImageIcon icon = new ImageIcon(File.pathSeparator);
                          JPanel pn = new JPanel();
                          JLabel lbl = new JLabel(icon);
                        pn.add(lbl);
                        pnCenter.add(pn, "card" + i);
                    }
                    showImage(pnCenter, "card0");
                }
            }
        });
        
 
 Container con = getContentPane();
        con.add(pnBorder);
    }

    private void showImage(JPanel pnCenter, String string)
{
        CardLayout cl = (CardLayout) pnCenter.getLayout();
        cl.show(pnCenter, string);
    }


    private class TimerPanel implements ActionListener {
        @Override

        public void actionPerformed(ActionEvent e) {
            showImage(pn, "card" + pos);
            pos++;
            if (pos >= 10) {
                pos = 1;
            }
        }
        JPanel pn=null;
        
        public TimerPanel(JPanel pn){
            this.pn=pn;
        }
    }
    public BT87(String title){
        super(title);
        timer=new Timer(599,null);
    }
    public void doShow(){
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addControl();
        setVisible(true);
    }

    public static void main(String[] args) {
        BT87 ba = new BT87("Image Animation!");
        ba.doShow();
    }
}
