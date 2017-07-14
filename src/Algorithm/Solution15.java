package Algorithm;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by smaug on 2017/6/2.
 */
public class Solution15
{
    public static void main(String[] args) {
        BinaryTreeNode treeNode = new BinaryTreeNode(1);
        treeNode.LeftChild = new BinaryTreeNode(2);
        treeNode.RightChild = new BinaryTreeNode(3);
        treeNode.LeftChild.LeftChild = new BinaryTreeNode(4);
        treeNode.LeftChild.RightChild = new BinaryTreeNode(5);
        treeNode.RightChild.LeftChild = new BinaryTreeNode(6);
        treeNode.RightChild.RightChild = new BinaryTreeNode(7);


        printTree(treeNode);
    }

    public static void printTree(BinaryTreeNode treeRoot) {
        Queue<BinaryTreeNode> queTree = new ArrayDeque<>();
        queTree.add(treeRoot);
        while (queTree.size() != 0) {
            BinaryTreeNode pNode = queTree.poll();
            System.out.print(pNode.val + " ");

            if (pNode.LeftChild != null)
                queTree.offer(pNode.LeftChild);
            if (pNode.RightChild != null)
                queTree.offer(pNode.RightChild);
        }

    }
}
