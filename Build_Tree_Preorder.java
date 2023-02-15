package Binary_Tree;
import java.util.*;
public class Build_Tree_Preorder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node BuildTree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newMode = new Node(nodes[index]);
            newMode.left = BuildTree(nodes);
            newMode.right = BuildTree(nodes);
            return newMode;
        }
        public static void preorder(Node root){
            if(root == null){
               return ;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        int nodes [] = { 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();

        Node root  = tree.BuildTree(nodes);
        System.out.println(root.data);

        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println( );
        tree.postorder(root);
    }
}
