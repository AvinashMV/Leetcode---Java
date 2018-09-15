import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinStack {
    /** initialize your data structure here. */
    private List<Integer> myInt;
    public MinStack() {
        myInt = new ArrayList<>();
    }

    public void push(int x) {
        myInt.add(x);
    }

    public void pop() {
        myInt.remove(myInt.size()-1);
    }

    public int top() {
        return myInt.get(myInt.size()-1);
    }

    public int getMin() {
        return Collections.min(myInt);
    }
}
