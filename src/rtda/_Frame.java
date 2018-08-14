package rtda;

public class _Frame {
    private _Frame lower;
    private _LocalVars localVars;
    private _OperandStack operandStack;
    private _Thread thread;
    private int nextPC;

    public _Frame(_Thread thread, int maxLocals, int maxStack) {
        this.thread = thread;
        this.localVars = new _LocalVars(maxLocals);
        this.operandStack = new _OperandStack(maxStack);
    }

    public _LocalVars localVars() {
        return this.localVars;
    }

    public _OperandStack operandStack() {
        return this.operandStack;
    }

    public _Thread thread() {
        return this.thread;
    }

    public int nextPC() {
        return this.nextPC;
    }

    public void setNextPC(int nextPC) {
        this.nextPC = nextPC;
    }
}
