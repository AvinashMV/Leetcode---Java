import java.util.ArrayList;

public class MyQueue {
    private ArrayList<Integer> mylist;

    /** Initialize your data structure here. */
    public MyQueue() {
        mylist = new ArrayList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        mylist.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int val = mylist.get(0);
        mylist.remove(0);
        return val;
    }

    /** Get the front element. */
    public int peek() {
        return mylist.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(mylist.size()==0)
            return true;
        else
            return false;
    }
}
