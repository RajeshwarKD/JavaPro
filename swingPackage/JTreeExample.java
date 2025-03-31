package SwingPackage;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeExample {
    JFrame f;
    JTree tree;
    JTreeExample(){
        f = new JFrame(" My JFrame");
        f.setBounds(100, 100, 300, 250 );

        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("TOP");

        DefaultMutableTreeNode A = new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode B = new DefaultMutableTreeNode("B");

        DefaultMutableTreeNode A1 = new DefaultMutableTreeNode("A1");
        DefaultMutableTreeNode A2 = new DefaultMutableTreeNode("A2");

        DefaultMutableTreeNode B1 = new DefaultMutableTreeNode("B1");
        DefaultMutableTreeNode B2 = new DefaultMutableTreeNode("B2");
        DefaultMutableTreeNode B3 = new DefaultMutableTreeNode("B3");

        A.add(A1);
        A.add(A2);

        B.add(B1);
        B.add(B2);
        B.add(B3);

        rootNode.add(A);
        rootNode.add(B);

        tree =new JTree(rootNode);
        f.add(tree);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JTreeExample();
    }
}
