package instructions.math.neg;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class INEG extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v = stack.popInt();
        stack.pushInt(-v);
    }
}
