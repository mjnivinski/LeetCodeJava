//import java.util.*;

public class BalancedBinaryTree {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        print("Hellow World");
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.left.left = new TreeNode(3);
        t.left.left.left = new TreeNode(4);
        t.left.left.right = new TreeNode(4);
        t.left.right = new TreeNode(3);
        t.right = new TreeNode(2);
        print("" + isBalanced(t));
    }

    private static boolean isBalanced(TreeNode n){
        if(n == null) return true;

        if(Math.abs(depth(n.left) - depth(n.right)) > 1){
            return false;
        }

        return isBalanced(n.left) && isBalanced(n.right);
    }

    private static int depth(TreeNode n){
        if(n == null) return -1;
        else{
            int left = depth(n.left);
            int right = depth(n.right);
            return left > right ? left + 1 : right + 1;
        }
    }

    private static void print(String s){
        System.out.println(s);
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
