/*problem-- push element at bottom of the stack
*time complexity- O(n)
* space complexity- O(n)*/
package stack;

import java.util.Stack;

public class S4_pushAtBottom {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(4,s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
