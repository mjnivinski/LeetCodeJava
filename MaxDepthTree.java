//import java.util.*;

public class MaxDepthTree {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        TreeNode t = new TreeNode(0);
        t.left = new TreeNode(1);
        t.left.left = new TreeNode(2);
        t.left.left.left = new TreeNode(3);
        t.left.left.left.left = new TreeNode(4);
        t.left.left.left.left.left = new TreeNode(5);
        t.left.left.left.left.left.left = new TreeNode(6);
        t.left.left.left.left.left.left.right = new TreeNode(7);
        t.left.left.left.left.left.left.right.left = new TreeNode(8);
        
        System.out.println(depth(t));
    }

    private static int depth(TreeNode root){
        //if(root!=null) System.out.println(root.val);
        if(root == null) return -1;
        else{
            int left = depth(root.left);
            int right = depth(root.right);
            return left > right ? left + 1 : right + 1;
        }
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
