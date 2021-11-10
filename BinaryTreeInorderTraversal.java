import java.util.*;

public class BinaryTreeInorderTraversal {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        method(root);
        
    }

    private static List<Integer> method(TreeNode root){
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> listy = new ArrayList<Integer>();
        System.out.println(!stack.empty() + " " + node);
        while(!stack.empty() || node != null){
            if(node != null){
                stack.push(node);
                node = node.left;
            }
            else{
                node = stack.pop();
                listy.add(node.val);
                node = node.right;
            }
        }
        return listy;
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
