package amazon_questions.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTrees {
    public static long find(long n) {
        long C = 1;
        for (int i = 0; i < n; ++i) {
            C = C * 2 * (2 * i + 1) / (i + 2);
        }
        return C;
    }

    public static class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static ArrayList<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }

        ArrayList<TreeNode> treeNodes = helper(1, n);
        printBinarySearchTree(treeNodes);
        return treeNodes;
    }

    private static ArrayList<TreeNode> helper(int m, int n) {
        ArrayList<TreeNode> result = new ArrayList<>();
        if (m > n) {
            result.add(null);
            return result;
        }

        for (int i = m; i <= n; i++) {
            ArrayList<TreeNode> ls = helper(m, i - 1);
            ArrayList<TreeNode> rs = helper(i + 1, n);
            for (TreeNode l : ls) {
                for (TreeNode r : rs) {
                    TreeNode curr = new TreeNode(i);
                    curr.left = l;
                    curr.right = r;
                    result.add(curr);
                }
            }
        }
        return result;
    }

    private static void printBinarySearchTree(ArrayList<TreeNode> treeNodes){
        for (int i = 0; i < treeNodes.size(); i++) {
            System.out.println("treeNodes index = " + i);
            printAllNodes(treeNodes.get(i), "root");
        }
    }

    public static void printLeafNodes(TreeNode node, String position) {
        // base case
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            System.out.printf("%s:%d ", position ,node.val);
            System.out.println("");
        }

        printLeafNodes(node.left, position + ":left");
        printLeafNodes(node.right, position + ":right");
    }

    public static void printAllNodes(TreeNode node, String position) {
        // base case
        if (node == null) {
            return;
        } else {
            System.out.printf("%s:%d ", position ,node.val);
            System.out.println("");
        }

        printAllNodes(node.left, position + ":left");
        printAllNodes(node.right, position + ":right");
    }

    public static boolean identicalTrees(TreeNode a, TreeNode b)
    {
        /*1. both empty */
        if (a == null && b == null)
            return true;

        /* 2. both non-empty -> compare them */
        if (a != null && b != null)
            return (a.val == b.val
                    && identicalTrees(a.left, b.left)
                    && identicalTrees(a.right, b.right));

        /* 3. one empty, one not -> false */
        return false;
    }
}
