
package BT84;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;

public class thitnuong {
     private JFrame frame;

    private void intialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 409);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        
        //----------------------------------------------- 
        JMenu mnM = new JMenu("File");
        menuBar.add(mnM);
        
        //----------------------------------------------- 
        JMenu mnM_2 = new JMenu("Open");
        mnM.add(mnM_2);
        
        //----------------------------------------------- 
        JMenu mnM_3 = new JMenu("Rights Management Service");
        mnM.add(mnM_3);
        
        //----------------------------------------------- 
        JMenu mnM_13 = new JMenu("Credential Management...");
        mnM_3.add(mnM_13);
        
        //----------------------------------------------- 
        JMenu mnM_14 = new JMenu("Sever Setting...");
        mnM_3.add(mnM_14);

        mnM_3.add(new JSeparator());
        
        //----------------------------------------------- 
        JMenu mnM_15 = new JMenu("Restricted Access");
        mnM_15.setEnabled(false);
        mnM_3.add(mnM_15);
        
        //----------------------------------------------- 
        JMenu menu = new JMenu("Close \t Ctrl+W");
        mnM.add(menu);
        
        //----------------------------------------------- 
        JMenu mnM_4 = new JMenu("Close all");
        mnM.add(mnM_4);
        
        //----------------------------------------------- 
        JMenu mnM_5 = new JMenu("Save \t Ctrl+S");
        mnM_5.setEnabled(false);
        mnM.add(mnM_5);
        
        //----------------------------------------------- 
        JMenu mnM_6 = new JMenu("Save as \t Ctrl+S");
        mnM.add(mnM_6);
        mnM.add(new JSeparator());
        
        //----------------------------------------------- 
        JMenu mnM_7 = new JMenu("Email");
        mnM.add(mnM_7);
        
        //----------------------------------------------- 
        JMenu mnM_8 = new JMenu("Share");
        mnM.add(mnM_8);
        mnM.add(new JSeparator());
        
        //----------------------------------------------- 
        JMenu mnM_9 = new JMenu("Print... \t Ctrl+P");
        mnM.add(mnM_9);
        mnM.add(new JSeparator());

        //----------------------------------------------- 
        JMenu mnM_10 = new JMenu("Properties");
        mnM.add(mnM_10);
        
        mnM.add(new JSeparator());
        
        //----------------------------------------------- 
        JMenu mnM_11 = new JMenu("ReCent file");
        mnM.add(mnM_11);
        
        mnM.add(new JSeparator());
        
        //----------------------------------------------- 
        JMenu mnM_12 = new JMenu("Exit \t Ctrl+Q");
        mnM.add(mnM_12);
        //----------------------------------------------- 
        JMenu mnM_1 = new JMenu("Edit");
        menuBar.add(mnM_1);

        //----------------------------------------------- 
        JMenu mnM_16 = new JMenu("Undo");
        mnM_1.add(mnM_16);
        mnM_16.setEnabled(false);
        
        //----------------------------------------------- 
        JMenu mnM_17 = new JMenu("Path");
        mnM_1.add(mnM_17);
        
        mnM_1.add(new JSeparator());
        
        //----------------------------------------------- 
        JMenu mnM_18 = new JMenu("Cut");
        mnM_18.setEnabled(false);
        mnM_1.add(mnM_18);
        
        
        //----------------------------------------------- 
        JMenu mnM_19 = new JMenu("Copy");
        mnM_19.setEnabled(false);
        mnM_1.add(mnM_19);
        
        
        //----------------------------------------------- 
        JMenu mnM_20 = new JMenu("Paste");
        mnM_20.setEnabled(false);
        mnM_1.add(mnM_20);
        
        
        //----------------------------------------------- 
        JMenu mnM_21 = new JMenu("Delete");
        mnM_21.setEnabled(false);
        mnM_1.add(mnM_21);
        
        mnM_1.add(new JSeparator());
        
        //----------------------------------------------- 
        JMenu mnM_22 = new JMenu("Select All");
        mnM_1.add(mnM_22);

        //----------------------------------------------- 
        JMenu mnM_23 = new JMenu("Deselect All");
        mnM_1.add(mnM_23);
        mnM_1.add(new JSeparator());

        //----------------------------------------------- 
        JMenu mnM_25 = new JMenu("Link");
        mnM_1.add(mnM_25);
        //-----------------------------------------------  
        JMenu mnM_26 = new JMenu("Rectangle Links");
        mnM_25.add(mnM_26);
        //----------------------------------------------- 
        JMenu mnM_27 = new JMenu("Polugon Links");
        mnM_25.add(mnM_27);
        mnM_1.add(new JSeparator());
        //----------------------------------------------- 
        JMenu mnM_28 = new JMenu("Attach A File");
        mnM_1.add(mnM_28);
        mnM_1.add(new JSeparator());
        //----------------------------------------------- 
        JMenu mnM_29 = new JMenu("Add Image");
        mnM_1.add(mnM_29);
        //----------------------------------------------- 
       
        JMenu mnM_30 = new JMenu("Add Multimedia");
        mnM_1.add(mnM_30);

    }

    public thitnuong() {
        intialize();
    }
    public static void main(String[] args) {
           EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               

                try {
                    thitnuong th = new thitnuong();
                    th.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }
}
