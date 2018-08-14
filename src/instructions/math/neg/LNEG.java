package instructions.math.neg;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class LNEG extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v = stack.popLong();
        stack.pushLong(-v);
    }
}
