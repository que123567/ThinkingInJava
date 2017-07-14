package Algorithm;

/**
 * Created by smaug on 2017/6/5.
 */
public class Solution17
{
    public static void main(String[] args) {
        ComplexListNode list = new ComplexListNode(1);
        list.Next = new ComplexListNode(2);
        list.Next.Next = new ComplexListNode(3);
        list.Next.Next.Next = new ComplexListNode(4);
        list.Next.Next.Next.Next = new ComplexListNode(5);


        CloneNode(list);
        CloneRandomNext(list);
        cutListNode(list);
        showList(list);
    }

    /**
     * 复制链表
     *
     * @param pHead
     */
    static void CloneNode(ComplexListNode pHead) {
        while (pHead != null) {
            ComplexListNode clone = new ComplexListNode();
            clone.val = pHead.val;
            clone.Next = pHead.Next;
            clone.randomNext = null;
            pHead.Next = clone;
            pHead = clone.Next;
        }
    }

    static void CloneRandomNext(ComplexListNode pHead) {
        while (pHead != null) {
            ComplexListNode Clone = pHead.Next;
            if (pHead.randomNext != null)
                Clone.randomNext = pHead.randomNext.Next;
            pHead = Clone.Next;
        }

    }

    /**
     * 切割链表
     *
     * @param pHead
     * @return
     */
    static ComplexListNode cutListNode(ComplexListNode pHead) {
        ComplexListNode pCloneHead = null;
        ComplexListNode pCloneNode = null;
        ComplexListNode pNode = pHead;

        if (pNode.Next != null) {
            pCloneHead = pCloneNode = pNode.Next;//保存复制链表的头部pCloneHead
            pNode.Next = pCloneNode.Next;
            pNode = pNode.Next;
        }
        while (pNode != null) {
            pCloneNode.Next = pNode.Next;
            pCloneHead = pCloneNode.Next;
            pNode.Next = pCloneNode.Next;
            pNode = pNode.Next;
        }
        return pHead;
    }


    /**
     * show list
     *
     * @param listNode
     */
    static void showList(ComplexListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.Next;
        }
    }

}
