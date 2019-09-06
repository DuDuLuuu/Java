package com.JDb.compute;

/**
 * @Author:JDb
 * @Date:2019/9/4
 */

import java.nio.file.FileStore;
import java.security.cert.X509Certificate;
import java.util.Stack;

/**
 * 使用栈实现队列的下列操作：

 push(x) -- 将一个元素放入队列的尾部。
 pop() -- 从队列首部移除元素。
 peek() -- 返回队列首部的元素。
 empty() -- 返回队列是否为空。
 示例:

 MyQueue queue = new MyQueue();

 queue.push(1);
 queue.push(2);
 queue.peek();  // 返回 1
 queue.pop();   // 返回 1
 queue.empty(); // 返回 false

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/implement-queue-using-stacks
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeeCode_232_Java {



    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.peek();  // 返回 1
        queue.pop();   // 返回 1
        queue.empty(); // 返回 false

    }
}
class MyQueue {

    Stack<Integer> stack;
    Stack<Integer> temp;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack();
        temp = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {

        while (stack.size() != 0) {
            temp.push(stack.pop());
        }
        Integer rs = temp.pop();
        while (temp.size() != 0) {
            stack.push(temp.pop());
        }
        return rs;
    }

    /** Get the front element. */
    public int peek() {
        boolean first=true;
        Integer rs=0;
        for (Integer integer : stack) {
            if (first) {
                rs = integer;
                break;
            }
        }
        return rs;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}


















