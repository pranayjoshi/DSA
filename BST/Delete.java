package BST;

public class Delete {

    public static void main(String[] args) {
        Node x = new Node(10);
        System.out.println(insert(x, 10));
    }

    static Node insert(Node root, int Key) {
        // your code here
        if(root==null){
            Node n= null;
            return n;
        }
        if(root.data>Key){
            root.left=insert(root.left,Key);
        }
        else if(root.data<Key){
            root.right=insert(root.right,Key);
        }
        return root;
    }

}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}