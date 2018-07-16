package rtda;

public class _Thread {
    private int pc;
    private _Stack stack = new _Stack(1024);

    public int pc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public void pushFrame(_Frame frame) {
        this.stack.push(frame);
    }

    public _Frame popFrame() {
        return this.stack.pop();
    }

    public _Frame currentFrame() {
        return this.stack.top();
    }
}
