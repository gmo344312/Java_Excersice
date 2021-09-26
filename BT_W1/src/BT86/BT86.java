
package BT86;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class BT86 extends JFrame {

    private static final long serialVersionUID = 1L;
    Timer timer;
    private int pos = 1;
    
      private void addImage(JPanel pnCenter, JPanel[] pnArr) {
        for (int i = 0; i < pnArr.length; i++) {
            pnArr[i] = new JPanel();
            JLabel lbl = new JLabel();
            ImageIcon icon = new ImageIcon("src\\Bai86\\Picture\\mèo 2.jpg");
            
            lbl.setIcon(icon);
            pnArr[i].add(lbl);
            pnCenter.add(pnArr[i], "card" + i);
        }
    }
      public void showImage(JPanel pnCenter, String string) {
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
          JPanel pn = null;

        public TimerPanel(JPanel pn) {
            this.pn = pn;
        }
    }


    public void addControl() {
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        JButton btnStart = new JButton("Start");
        JButton btnStop = new JButton("Stop");
        pnNorth.add(btnStart);
        pnNorth.add(btnStop);
        pnBorder.add(pnNorth, BorderLayout.NORTH);
        final JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new CardLayout());
        pnBorder.add(pnCenter, BorderLayout.CENTER);
        pnCenter.setBackground(Color.RED);
        JPanel[] pnArr = new JPanel[10];
        addImage(pnCenter, pnArr);
        showImage(pnCenter, "card1");
        
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
                timer.addActionListener(new TimerPanel(pnCenter));
            }
        });
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });
        Container con = getContentPane();
        con.add(pnBorder);
    }
    
     public BT86(String title) {
        super(title);
        timer = new Timer(500, null);
    }
    

     public void doShow() {
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addControl();
        setVisible(true);
    }
        

    public static void main(String[] args) {
        BT86 ca= new BT86("Image Animation!");
        ca.doShow();
    }
}
