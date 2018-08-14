package instructions.math.neg;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class DNEG extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v = stack.popDouble();
        stack.pushDouble(-v);
    }
}
