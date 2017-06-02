package Algorithm;

/**
 * Created by smaug on 2017/6/1.
 */
public class Solution11
{
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(5);
        listNode.next.next.next = new ListNode(7);

        ListNode listNode2 = new ListNode(2);
        listNode2.next = new ListNode(4);
        listNode2.next.next = new ListNode(6);
        listNode2.next.next.next = new ListNode(8);



        ListNode newListNode = mergeListNode(listNode, listNode2);
        while (newListNode.next != null) {
            System.out.println(newListNode.val);
            newListNode = newListNode.next;
        }
    }

    public static ListNode mergeListNode(ListNode pHeda1, ListNode pHead2) {
        if (pHeda1 == null)
            return pHead2;
        else if (pHead2 == null)
            return pHeda1;

        ListNode mergedHead = null;

        if (pHeda1.val < pHead2.val) {
            mergedHead = pHeda1;
            mergedHead.next = mergeListNode(pHeda1.next, pHead2);//新头部的下一个节点是剩下两个链表节点头中值较小的一个
        } else {
            mergedHead = pHead2;
            mergedHead.next = mergeListNode(pHeda1, pHead2.next);
        }
        return mergedHead;
    }
}
