package Algorithm;

/**
 * Created by smaug on 2017/6/5.
 */
public class ComplexListNode //复杂链表，除next外还包含随机指向的指针
{
    int val;
    ComplexListNode randomNext;
    ComplexListNode Next;

    public ComplexListNode() {
    }

    public ComplexListNode(int val) {
        this.val = val;
    }
}
