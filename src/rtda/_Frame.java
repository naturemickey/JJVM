package rtda;

public class _Frame {
    private _LocalVars localVars;
    private _OperandStack operandStack;

    public _Frame(int maxLocals, int maxStack) {
        this.localVars = new _LocalVars(maxLocals);
        this.operandStack = new _OperandStack(maxStack);
    }

    public _LocalVars localVars() {
        return this.localVars;
    }

    public _OperandStack operandStack() {
        return this.operandStack;
    }
}
