package Algorithm;

/**
 * Created by smaug on 2017/6/1.
 */
class BinaryTreeNode
{
    int val;

    BinaryTreeNode LeftChild;
    BinaryTreeNode RightChild;

    public BinaryTreeNode(int val) {
        this.val = val;
    }

}


public class Solution12
{
    public static void main(String[] args) {

        BinaryTreeNode treeBig = new BinaryTreeNode(8);
        treeBig.LeftChild = new BinaryTreeNode(8);
        treeBig.RightChild = new BinaryTreeNode(7);
        treeBig.LeftChild.LeftChild = new BinaryTreeNode(9);
        treeBig.LeftChild.RightChild = new BinaryTreeNode(2);
        treeBig.LeftChild.RightChild.LeftChild = new BinaryTreeNode(4);
        treeBig.LeftChild.RightChild.RightChild = new BinaryTreeNode(7);


        BinaryTreeNode treeSmall = new BinaryTreeNode(8);
        treeSmall.LeftChild = new BinaryTreeNode(9);
        treeSmall.RightChild = new BinaryTreeNode(2);

        System.out.println(hasSubTree(treeBig, treeSmall));

    }

    static boolean hasSubTree(BinaryTreeNode treeRoot1, BinaryTreeNode treeRoot2) {
        Boolean result = false;
        if (treeRoot1 != null && treeRoot2 != null) {
            if (treeRoot1.val == treeRoot2.val)
                result = DoesTreeHasAnotherTree(treeRoot1, treeRoot2);
            if (!result)
                result = hasSubTree(treeRoot1.LeftChild, treeRoot2);
            if (!result)
                result = hasSubTree(treeRoot1.RightChild, treeRoot2);
        }
        return result;
    }


    /**
     * 一次不等，立即false;
     * 搜索到大树的末尾还没有返回true，说明不可能等。
     * 搜索到小树的末尾还没有返回false，说明相等。
     *
     * @param treeRoot1
     * @param treeRoot2
     * @return
     */
    static private Boolean DoesTreeHasAnotherTree(BinaryTreeNode treeRoot1, BinaryTreeNode treeRoot2) {
        if (treeRoot2 == null)
            return true;
        if (treeRoot1 == null)
            return false;

        if (treeRoot1.val != treeRoot2.val)
            return false;

        return DoesTreeHasAnotherTree(treeRoot1.LeftChild, treeRoot2.LeftChild) && DoesTreeHasAnotherTree(treeRoot1.RightChild,
                treeRoot2.RightChild);
    }
}
