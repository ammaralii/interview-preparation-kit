package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTreeInorderTraversalTest {

    @Test
    public void success_merge_test_0() {
        BinaryTreeInorderTraversal.TreeNode treeNode = new BinaryTreeInorderTraversal.TreeNode(1);
        treeNode.right = new BinaryTreeInorderTraversal.TreeNode(2);
        treeNode.right.left = new BinaryTreeInorderTraversal.TreeNode(3);
        Assert.assertEquals(BinaryTreeInorderTraversal.inorderTraversal(treeNode), Arrays.asList(1, 3, 2));
    }

    @Test
    public void success_merge_test_1() {
        Assert.assertEquals(BinaryTreeInorderTraversal.inorderTraversal(null), new ArrayList<>());
    }

    @Test
    public void success_merge_test_2() {
        BinaryTreeInorderTraversal.TreeNode treeNode = new BinaryTreeInorderTraversal.TreeNode(1);
        Assert.assertEquals(BinaryTreeInorderTraversal.inorderTraversal(treeNode), Arrays.asList(1));
    }
}
