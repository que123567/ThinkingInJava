package Algorithm;

import java.util.Stack;

/**
 * Created by smaug on 2017/6/1.
 */
public class Solution14
{

    Stack mDate = new Stack();
    Stack mMinDate = new Stack();

    public static void main(String[] args) {
        Solution14 stack = new Solution14();
        stack.push(3);
        stack.push(7);
        stack.push(1);
        stack.push(9);
        stack.push(6);
        stack.push(4);
        stack.push(0);
        stack.push(3);
        stack.push(6);

        System.out.println(stack.min());

        stack.pop();
        System.out.println(stack.min());

        stack.pop();
        System.out.println(stack.min());



    }

    public void push(int value) {
        mDate.push(value);
        if (mMinDate.size() == 0 || (value < (int) mMinDate.peek())) {
            mMinDate.push(value);

        } else
            mMinDate.push(mMinDate.peek());
    }

    public void pop() {
        if (mMinDate.size() > 0 & mDate.size() > 0) {
            mMinDate.pop();
            mDate.pop();
        }
    }

    public int min() {
        if (mMinDate.size() > 0)
            return (int) mMinDate.peek();
        else
            return -1;
    }
}
