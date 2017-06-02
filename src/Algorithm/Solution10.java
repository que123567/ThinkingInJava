package Algorithm;

/**
 * Created by smaug on 2017/5/31.
 */
public class Solution10
{
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        reverseList(listNode);

    }


    public static ListNode reverseList(ListNode listNodeHead) {
        ListNode pRevertHead = null;
        ListNode pNode = listNodeHead;
        ListNode pPrev = null;
        while (pNode != null) {
            ListNode pNext = pNode.next;
            if (pNext == null) {
                pRevertHead = pNode;
            }
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        while (pRevertHead.next != null) {
            System.out.println(pRevertHead.val);
            pRevertHead = pRevertHead.next;
        }
        System.out.println(pRevertHead.val);
        return pRevertHead;
    }
}
