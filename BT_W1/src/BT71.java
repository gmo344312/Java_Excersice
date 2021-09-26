import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;


public class BT71 extends JFrame {

    DefaultListModel modelTen, modelOut;
    JList<String> lst;
    JList<String> lst1;
    JButton btC;

    private void addControls(){
        Container con = getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.CENTER));

        modelTen = new DefaultListModel<>();
        modelTen.addElement("Black");
        modelTen.addElement("Blue");
        modelTen.addElement("Dark");
        lst = new JList<>(modelTen);

        JScrollPane sc = new JScrollPane(lst, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        lst.setVisibleRowCount(5);
        lst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        btC = new JButton("Copy>>");
        Font font = new Font("Arial", Font.BOLD, 20);

        btC.setFont(font);
        modelOut = new DefaultListModel<>();
        String[] arr = docTextFile("data");
        if (arr != null) {
            for (String arr1 : arr) {
                modelOut.addElement(arr1);
            }
        }
        lst1 = new JList<>(modelOut);
        lst1.setVisibleRowCount(5);
        JScrollPane sc1 = new JScrollPane(lst1, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        con.add(sc);
        con.add(btC);
        con.add(sc1);

    }

    private void addEvents() {
        btC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                Object[] arr = lst.getSelectedValues();
                for (Object data : arr) {
                    modelOut.addElement(data);
                }
                lst1.setModel(modelOut);
                String data = "";
                for (int i = 0; i < lst1.getModel().getSize(); i++) {
                    data += String.valueOf(lst1.getModel().getElementAt(i)) + ".";

                }
                luuTextFile("data", data);

            }
        });
    }

    void luuTextFile(String filename, String data) {
        try {
            FileOutputStream fOut = new FileOutputStream(filename);
            PrintWriter print = new PrintWriter(fOut, true);
            print.println(data);
            print.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    String[] docTextFile(String filename){
        try {
            FileInputStream fIn = new FileInputStream(filename);
            Scanner sc = new Scanner(fIn);
            String[] data = null;
            while (sc.hasNextLine()) {

                String s = sc.nextLine();
                data = s.split(";");
            }
            fIn.close();
            sc.close();
            return data;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    public BT71() {
        super("Test");
        addControls();
        addEvents();
    }

    public static void main(String[] args) {
        BT71 si = new BT71();
        si.setSize(400, 150);
        si.setLocationRelativeTo(null);
        si.setVisible(true);
    }

}
