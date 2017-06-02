package Algorithm;

/**
 * Created by smaug on 2017/5/30.
 */


public class Solution8
{
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.Next = new ListNode(2);
        listNode.Next.Next = new ListNode(3);
        listNode.Next.Next.Next = new ListNode(4);
        listNode.Next.Next.Next.Next = new ListNode(5);

        deleteNode(listNode, listNode.Next.Next.Next.Next);
        printListValues(listNode);
    }

    static class ListNode
    {
        public ListNode(int value) {
            this.value = value;
        }

        int value;
        ListNode Next;
    }

    static void deleteNode(ListNode listHead, ListNode listDeleted) {
        if (listHead == null || listDeleted == null) return;
        if (listDeleted.Next != null) { //O(1)删除链表
            ListNode pNext = listDeleted.Next;
            listDeleted.value = pNext.value;
            listDeleted.Next = pNext.Next;
        } else if (listHead.equals(listDeleted)) { //只有一个链
            listHead = null;
        } else {//链在末尾
            ListNode pNode = listHead;
            while (pNode.Next != listDeleted) {
                pNode = pNode.Next;
            }
            pNode.Next = null;
        }
    }

    static void printListValues(ListNode listNode) {
        while (listNode != null &&listNode.Next!=null) {
            System.out.println(listNode.value);
            listNode = listNode.Next;
        }
        System.out.println(listNode.value);
    }
}
