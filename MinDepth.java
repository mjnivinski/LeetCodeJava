//import java.util.*;

public class MinDepth {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        print("Hellow World");
        TreeNode t = new TreeNode(5);
        t.left = new TreeNode(9);
        t.left.left = new TreeNode(9);
        t.left.left.left = new TreeNode(9);
        System.out.print(minDepth(t));
    }

    private static int minDepth(TreeNode root){
        if(root.left == null && root.right == null) return 1;
        else{
            if(root.left == null) return minDepth(root.right) + 1;
            if(root.right == null) return minDepth(root.left) + 1;
            else return 1 + Math.min(minDepth(root.left),minDepth(root.right));
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

    private static void print(String s){
        System.out.println(s);
    }
}
