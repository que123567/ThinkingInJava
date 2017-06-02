package Algorithm;

import java.util.ArrayList;

/**
 * Created by smaug on 2017/5/29.
 */

class ListNode
{
    ListNode(int val) {
        this.val = val;
    }

    ListNode() {
    }

    int val;

    ListNode next = null;

}

public class Solution2
{


    public static void main(String[] args) {
        Solution2 a = new Solution2();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);

        a.printListFromTailToHead(listNode);
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            if (listNode.next != null)
                printListFromTailToHead(listNode.next);
        }
        System.out.println(listNode.val);
        return null;
    }

}
