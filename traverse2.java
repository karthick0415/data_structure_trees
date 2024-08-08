import java.util.*;
// step 1
class treenode{
    int value;
    treenode left, right;
    treenode(int value) {
        this.value = value;
        left = right = null;
    }
}
public class traverse2{
    public void preorder(treenode node) {
        if (node == null)
        return;
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    public void postorder(treenode node) {
        if (node == null)
        return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }
    public void inorder(treenode node) {
        if (node == null)
        return;
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }
    public static void main(String[] args) {
        // root
        treenode root = new treenode(4);
        //left
        root.left = new treenode(2);
        root.left.left = new treenode(3);
        root.left.left.right = new treenode(9);
        root.left.left.right.left=new treenode(1);
        //right
        root.right = new treenode(5);
        root.right.left = new treenode(7);
        root.right.right = new treenode(6);
        root.right.right.left = new treenode(8);
        traverse2 tree=new traverse2();
        System.out.print("\npreorder traversal:");
        tree.preorder(root);
        System.out.print("\npostorder traversal:");
        tree.postorder(root);
        System.out.print("\ninorder traversal:");
        tree.inorder(root);
    }
}