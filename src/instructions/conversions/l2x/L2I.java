package instructions.conversions.l2x;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class L2I extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var l = stack.popLong();
        var i = (int) l;
        stack.pushInt(i);
    }
}
