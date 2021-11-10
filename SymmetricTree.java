//import java.util.*;

public class SymmetricTree {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        method(new TreeNode());
    }

    private static boolean method(TreeNode r){
        return isSameTree(r.left,r.right);
    }

    private static boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
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
