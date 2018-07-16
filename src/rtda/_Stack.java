package rtda;


import java.util.ArrayDeque;
import java.util.Deque;

public class _Stack {
    private final int maxSize;
    private Deque<_Frame> stack;

    public _Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new ArrayDeque<>(maxSize);
    }


    public void push(_Frame frame) {
        if (stack.size() >= maxSize) {
            throw new StackOverflowError();
        }
        stack.push(frame);
    }

    public _Frame pop() {
        if (this.stack.size() == 0) {
            throw new NullPointerException("jvm stack is empty!");
        }
        return this.stack.pop();
    }

    public _Frame top() {
        if (this.stack.size() == 0) {
            throw new NullPointerException("jvm stack is empty!");
        }
        return this.stack.peekFirst();
    }

}
