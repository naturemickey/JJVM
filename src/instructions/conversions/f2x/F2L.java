package instructions.conversions.f2x;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class F2L extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var f = stack.popFloat();
        var l = (long) f;
        stack.pushLong(l);
    }
}
