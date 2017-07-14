package Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smaug on 2017/6/3.
 */
public class Solution16
{
    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(10);
        tree.LeftChild = new BinaryTreeNode(5);
        tree.RightChild = new BinaryTreeNode(12);
        tree.LeftChild.LeftChild = new BinaryTreeNode(4);
        tree.LeftChild.RightChild = new BinaryTreeNode(7);
        findPath(tree, 22);
    }

    public static void findPath(BinaryTreeNode treeRoot, int expectedSum) {
        if (treeRoot == null)
            return;
        List<Integer> resultList = new ArrayList<>();
        int currentSum = 0;
        findPath(treeRoot, expectedSum, resultList, currentSum);

    }

    private static void findPath(BinaryTreeNode treeRoot, int expectedSum, List<Integer> resultList, int currentSum) {

        currentSum += treeRoot.val;//记录当前路径值
        resultList.add(treeRoot.val);

        if (currentSum == expectedSum && treeRoot.LeftChild == null && treeRoot.RightChild == null) {
            System.out.println("---当前路径和：" + expectedSum + "----");
            for (int i : resultList) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        if (treeRoot.LeftChild != null) {
            findPath(treeRoot.LeftChild, expectedSum, resultList, currentSum);
        }
        if (treeRoot.RightChild != null) {
            findPath(treeRoot.RightChild, expectedSum, resultList, currentSum);
        }

        currentSum -= treeRoot.val;
        resultList.remove(resultList.size() - 1);


    }


}
