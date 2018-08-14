package instructions.math.neg;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class FNEG extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v = stack.popFloat();
        stack.pushFloat(-v);
    }
}
