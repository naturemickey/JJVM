package instructions.comparisons.lcmp;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class LCMP extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v2 = stack.popLong();
        var v1 = stack.popLong();
        if (v1 > v2)
            stack.pushInt(1);
        else if (v1 == v2)
            stack.pushInt(0);
        else
            stack.pushInt(-1);
    }
}
