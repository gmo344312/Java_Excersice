
import javax.swing.JFrame;

public class BT62 {

    public static class MyWindow extends JFrame{
        public MyWindow(){
        super("Demo Windows");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }       
}
    public static void main(String[] args) {
        MyWindow ui = new MyWindow();
        ui.setSize(400,300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        
    }   
}
