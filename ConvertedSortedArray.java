import java.util.Arrays;

//import java.util.*;

public class ConvertedSortedArray {
    public static void main(String args[]){
        //int[] nums = new int[]{-10,-3,0,5,9};
        int[] nums = new int[]{0,1,2,3,4,5};
        TreeNode t = method(nums);
        TreeNode b = new TreeNode(5);
        b.left = new TreeNode(4);
        b.right = new TreeNode(4);

        //printTree(b);

        printTree(t);
    }

    private static TreeNode method(int[] nums){
        int size = nums.length;

        if(size == 0) return null;
        if(size == 1) return new TreeNode(nums[0]);

        int mid = nums.length/2;

        TreeNode node = new TreeNode(nums[mid]);

        node.left = method(Arrays.copyOfRange(nums, 0, mid));
        node.right = method(Arrays.copyOfRange(nums, mid+1, nums.length));

        return node;
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
}