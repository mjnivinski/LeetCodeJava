// import java.util.*;
public class SameTree {
    public static void main(String args[]){
       //method(new TreeNode(), new TreeNode());
       TreeNode t1 = new TreeNode(1);
       t1.left = new TreeNode(2);
       //t1.right = new TreeNode(3);
       //t1.left.left = new TreeNode(2);
       //t1.left.left.left = new TreeNode(1);
       TreeNode t2 = new TreeNode(1);
       t2.left = new TreeNode(2);
       //t2.right = new TreeNode(3);
       //t2.left = new TreeNode(3);
       //t2.left.left = new TreeNode(2);
       //t2.left.left.left = new TreeNode(1);
       System.out.println(method(t1,t2));
       //Stack<TreeNode> s = new Stack<TreeNode>();
       //s.push(t1.right);
    }

    private static boolean method(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return (method(p.left,q.left) && method(p.right,q.right));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
