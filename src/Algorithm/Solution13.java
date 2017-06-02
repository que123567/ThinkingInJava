package Algorithm;

/**
 * Created by smaug on 2017/6/1.
 */
public class Solution13
{
    public static void main(String[] args) {
        BinaryTreeNode treeBig = new BinaryTreeNode(8);
        treeBig.LeftChild = new BinaryTreeNode(6);
        treeBig.RightChild = new BinaryTreeNode(10);
        treeBig.LeftChild.LeftChild = new BinaryTreeNode(5);
        treeBig.LeftChild.RightChild = new BinaryTreeNode(7);
        treeBig.RightChild.LeftChild = new BinaryTreeNode(9);
        treeBig.RightChild.RightChild = new BinaryTreeNode(11);

        MirrorTree(treeBig);
//        System.out.println(treeBig.val);
//        System.out.println(treeBig.LeftChild.val);
//        System.out.println(treeBig.LeftChild.LeftChild.val);


        /**
         * 只有左子树
         */
        BinaryTreeNode treeSmall = new BinaryTreeNode(1);
        treeSmall.LeftChild = new BinaryTreeNode(2);
//        treeSmall.LeftChild.LeftChild = new BinaryTreeNode(3);

        MirrorTree(treeSmall);
        System.out.println(treeSmall.RightChild.val);
//        System.out.println(treeSmall.RightChild.RightChild.val);


    }


    public static void MirrorTree(BinaryTreeNode treeRoot) {

        if (treeRoot == null)
            return;
        if (treeRoot.LeftChild == null && treeRoot.RightChild == null)
            return;

        /**
         * 交换
         */
        BinaryTreeNode tmpTree = treeRoot.LeftChild;
        treeRoot.LeftChild = treeRoot.RightChild;//treeRoot.RightChild如果不存在，就是null，此时不会空指针异常，但是如果试图访问其val会产生空指针异常
        treeRoot.RightChild = tmpTree;

        if (treeRoot.LeftChild != null)
            MirrorTree(treeRoot.LeftChild);
        if (treeRoot.RightChild != null)
            MirrorTree(treeRoot.RightChild);
    }


}
