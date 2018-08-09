package instructions.conversions.l2x;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class L2F extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var l = stack.popLong();
        var f = (float) l;
        stack.pushFloat(f);
    }
}
