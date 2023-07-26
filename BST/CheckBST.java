package BST;

public class CheckBST {
    public static void main(String[] args) {
        
    }
    boolean isBST(Node root)
    {
        return rec(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    boolean rec(Node root,int i,int j){
        if(root==null) return true;
        if(root.data<=i||root.data>=j) return false;
        return rec(root.left,i,root.data)&&rec(root.right,root.data,j);
    }
}
