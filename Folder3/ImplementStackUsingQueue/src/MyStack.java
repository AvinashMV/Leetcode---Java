import java.util.ArrayList;

public class MyStack {
    /** Initialize your data structure here. */
    private ArrayList<Integer> alist;

    public MyStack() {
        alist = new ArrayList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        alist.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int val = alist.get(alist.size()-1);
        alist.remove(alist.size()-1);
        return val;
    }

    /** Get the top element. */
    public int top() {
        return alist.get(alist.size()-1);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(alist.size()==0)
            return true;
        else
            return false;
    }
}
