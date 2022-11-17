package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;

        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalHelperUsingRecursive(root, result);
        return result;
    }

    private static void inorderTraversalHelperUsingRecursive(TreeNode node, List<Integer> result) {
        if (node == null)
            return;

        //first recur on left child
        inorderTraversalHelperUsingRecursive(node.left, result);

        //Add node data to List
        result.add(node.val);

        //now recur on right child
        inorderTraversalHelperUsingRecursive(node.right, result);
    }

    private static void inorderTraversalHelperUsingStack(TreeNode node, List<Integer> result) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = node;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
    }
}
