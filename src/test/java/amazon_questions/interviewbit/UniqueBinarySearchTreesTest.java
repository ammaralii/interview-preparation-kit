package amazon_questions.interviewbit;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class UniqueBinarySearchTreesTest {
    @Test
    public void success_find_test_0() {
        Assert.assertTrue(UniqueBinarySearchTrees.find(3) == 5);
    }

    @Test
    public void success_find_test_1() {
        Assert.assertTrue(UniqueBinarySearchTrees.find(4) == 14);
    }

    @Test
    public void success_find_test_2() {
        Assert.assertTrue(UniqueBinarySearchTrees.find(5) == 42);
    }

    @Test
    public void success_generateTrees_test_0() {
        ArrayList<UniqueBinarySearchTrees.TreeNode> list = new ArrayList<>();
        UniqueBinarySearchTrees.TreeNode treeNode1 = new UniqueBinarySearchTrees.TreeNode(1);
        treeNode1.right = new UniqueBinarySearchTrees.TreeNode(2);
        treeNode1.right.right = new UniqueBinarySearchTrees.TreeNode(3);
        list.add(treeNode1);
        UniqueBinarySearchTrees.TreeNode treeNode2 = new UniqueBinarySearchTrees.TreeNode(1);
        treeNode2.right = new UniqueBinarySearchTrees.TreeNode(3);
        treeNode2.right.left = new UniqueBinarySearchTrees.TreeNode(2);
        list.add(treeNode2);
        UniqueBinarySearchTrees.TreeNode treeNode3 = new UniqueBinarySearchTrees.TreeNode(2);
        treeNode3.left = new UniqueBinarySearchTrees.TreeNode(1);
        treeNode3.right = new UniqueBinarySearchTrees.TreeNode(3);
        list.add(treeNode3);
        UniqueBinarySearchTrees.TreeNode treeNode4 = new UniqueBinarySearchTrees.TreeNode(3);
        treeNode4.left = new UniqueBinarySearchTrees.TreeNode(1);
        treeNode4.left.right = new UniqueBinarySearchTrees.TreeNode(2);
        list.add(treeNode4);
        UniqueBinarySearchTrees.TreeNode treeNode5 = new UniqueBinarySearchTrees.TreeNode(3);
        treeNode5.left = new UniqueBinarySearchTrees.TreeNode(2);
        treeNode5.left.left = new UniqueBinarySearchTrees.TreeNode(1);
        list.add(treeNode5);

        ArrayList<UniqueBinarySearchTrees.TreeNode> resultTrees = UniqueBinarySearchTrees.generateTrees(3);
        for (int i = 0; i < list.size(); i++) {
            Assert.assertTrue(UniqueBinarySearchTrees.identicalTrees(list.get(i),resultTrees.get(i)));
        }
    }

    @Test
    public void success_generateTrees_test_1() {
        ArrayList<UniqueBinarySearchTrees.TreeNode> list = new ArrayList<>();
        UniqueBinarySearchTrees.TreeNode treeNode1 = new UniqueBinarySearchTrees.TreeNode(1);
        treeNode1.right = new UniqueBinarySearchTrees.TreeNode(2);
        list.add(treeNode1);
        UniqueBinarySearchTrees.TreeNode treeNode2 = new UniqueBinarySearchTrees.TreeNode(2);
        treeNode2.left = new UniqueBinarySearchTrees.TreeNode(1);
        list.add(treeNode2);

        ArrayList<UniqueBinarySearchTrees.TreeNode> resultTrees = UniqueBinarySearchTrees.generateTrees(2);
        for (int i = 0; i < list.size(); i++) {
            Assert.assertTrue(UniqueBinarySearchTrees.identicalTrees(list.get(i),resultTrees.get(i)));
        }
    }
}
