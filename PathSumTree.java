//import java.util.*;

public class PathSumTree {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        print("Hellow World");

        TreeNode n = new TreeNode(5);
        n.left = new TreeNode(1);
        n.left.right = new TreeNode(6);
        n.left.left = new TreeNode(7);
        n.right = new TreeNode(3);
        n.right.right = new TreeNode(10);
        //n.right.left = new TreeNode(2);

        print("tree");
        printTree(n);
        print("hasPathSum");

        for (int i = 0; i < 22; i++) {
            if(hasPathSum(n, i)) print("i: " + i + " true");
        }
        //print("" + hasPathSum(n, 5));
    }


    private static boolean hasPathSum(TreeNode root, int targetSum){
        if(root == null) return false;
        return (root.left == null && root.right == null && targetSum == root.val)
            || hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }

    public static void printTree(TreeNode r){
        if(r==null) return;
        printTree(r.left);
        System.out.println(r.val);
        printTree(r.right);
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
