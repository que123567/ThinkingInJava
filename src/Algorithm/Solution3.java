package Algorithm;

import java.util.Stack;

/**
 * Created by smaug on 2017/5/29.
 */
public class Solution3
{

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        if (stack2.size() == 0) {//空 取，不空 返回
            while (stack1.size() > 0) {
                int tmpNode = stack1.pop();
                stack2.push(tmpNode);
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Solution3 a = new Solution3();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        System.out.print(a.pop());
        System.out.print(a.pop());
        System.out.print(a.pop());
        System.out.print(a.pop());
    }

}
