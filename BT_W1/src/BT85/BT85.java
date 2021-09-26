
package BT85;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;

public class BT85 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JToolBar toolBar = new JToolBar();
        //button 1
        JButton button = new JButton(new ImageIcon("src\\Bai85\\Picture\\Folderr.png"));
        
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        toolBar.add(button);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Folder");
            }
        });
        //button 2
        JButton button1 = new JButton(new ImageIcon(""));
        
        button1.setBorderPainted(false);
        button1.setContentAreaFilled(false);
        toolBar.add(button1);
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Save");
            }
        });
        //button 3
        JButton button2 = new JButton(new ImageIcon("src\\Bai85\\Picture\\save.png"));
        
        button2.setBorderPainted(false);
        button2.setContentAreaFilled(false);
        toolBar.add(button2);
        
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Save as");
            }
        });
        //button 4
        JButton button3 = new JButton(new ImageIcon("src\\Bai85\\Picture\\print.png"));
        button3.setBorderPainted(false);
        button3.setContentAreaFilled(false);
        toolBar.add(button3);

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Print");
            }
        });
        //button 5
        JButton button4 = new JButton(new ImageIcon("src\\Bai85\\Picture\\weather.png"));
        button4.setBorderPainted(false);
        button4.setContentAreaFilled(false);
        toolBar.add(button4);
        
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Weather");
            }
        });
        //button 6
        JButton button5 = new JButton(new ImageIcon("src\\Bai85\\Picture\\facebook.png"));
        button5.setBorderPainted(false);
        button5.setContentAreaFilled(false);
        toolBar.add(button5);
        
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Facebook");
            }
        });
        //button 7
        JButton button6 = new JButton(new ImageIcon("src\\Bai85\\Picture\\full.png"));
        button6.setBorderPainted(false);
        button6.setContentAreaFilled(false);
        toolBar.add(button6);
        
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Full size");
            }
        });
        //button 8
        JButton button7 = new JButton(new ImageIcon("src\\Bai85\\Picture\\hand.png"));
        button7.setBorderPainted(false);
        button7.setContentAreaFilled(false);
        toolBar.add(button7);
        
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Hand");
            }
        });
        //button 9
        JButton button8 = new JButton(new ImageIcon("src\\Bai85\\Picture\\search.png"));
        button8.setBorderPainted(false);
        button8.setContentAreaFilled(false);
        toolBar.add(button8);
        
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Search");
            }
        });
        //button 10
        JButton button9 = new JButton(new ImageIcon("src\\Bai85\\Picture\\select.png"));
        button9.setBorderPainted(false);
        button9.setContentAreaFilled(false);
        toolBar.add(button9);
       
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Select");
            }
        });
        //button 11
        JButton button10 = new JButton(new ImageIcon("src\\Bai85\\Picture\\text.png"));
        button10.setBorderPainted(false);
        button10.setContentAreaFilled(false);
        toolBar.add(button10);
     
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Text");
            }
        });
        //button 12
        JButton button11 = new JButton(new ImageIcon("src\\Bai85\\Picture\\camera.png"));
        button11.setBorderPainted(false);
        button11.setContentAreaFilled(false);
        toolBar.add(button11);
        
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Camera");
            }
        });
        //button 13
        JButton button12 = new JButton(new ImageIcon("src\\Bai85\\Picture\\rms.png"));
        button12.setBorderPainted(false);
        button12.setContentAreaFilled(false);
        toolBar.add(button12);
        
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("RMS");
            }
        });
        //button 14
        JButton button13 = new JButton(new ImageIcon("src\\Bai85\\Picture\\setting.png"));
        button13.setBorderPainted(false);
        button13.setContentAreaFilled(false);
        toolBar.add(button13);
        
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Setting");
            }
        });
        frame.add(toolBar);
        frame.setSize(900, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
