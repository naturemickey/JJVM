package instructions.conversions.f2x;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class F2D extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var f = stack.popFloat();
        var d = (double) f;
        stack.pushDouble(d);
    }
}
