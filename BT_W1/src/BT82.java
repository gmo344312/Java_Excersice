



import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;

public class BT82 {
    private JFrame frame;
    int i=0;

    private void initialize()
    {
        frame=new JFrame();
        frame.setBounds(100,100,450,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTree tree=new JTree();
        frame.getContentPane().add(tree, BorderLayout.CENTER);

        JPanel panel=new JPanel();
        frame.getContentPane().add(panel, BorderLayout.SOUTH);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));

        JButton btAC=new JButton("Add Child");
        btAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode)tree.getSelectionPath().getLastPathComponent();
                DefaultMutableTreeNode newNode=new DefaultMutableTreeNode("Con"+(i+1));
                ++i;
                selectedNode.add(newNode);
                DefaultTreeModel model=(DefaultTreeModel) tree.getModel();
                model.reload();
            }
        });
        panel.add(btAC);

        JButton btAS=new JButton("Add Sibling");
        btAS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultMutableTreeNode newNode=new DefaultMutableTreeNode("Con"+(i+1));
                ++i;
                DefaultMutableTreeNode t=(DefaultMutableTreeNode) tree.getModel().getRoot();
                t.add(newNode);
                DefaultTreeModel model=(DefaultTreeModel) tree.getModel();
                model.reload();
            }
        });
        panel.add(btAS);

        JButton btnew=new JButton("Delete");
        btnew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
                if(selectedNode!=tree.getModel().getRoot())
                {
                    DefaultTreeModel model=(DefaultTreeModel) tree.getModel();
                    model.removeNodeFromParent(selectedNode);
                    model.reload();
                }
            }
        });
        panel.add(btnew);
    }
    public BT82()
    {
        initialize();
    }
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try
                {
                    BT82 ui=new BT82();
                    ui.frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}
