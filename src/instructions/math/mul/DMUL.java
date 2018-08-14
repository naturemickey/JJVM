package instructions.math.mul;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class DMUL extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v2 = stack.popDouble();
        var v1 = stack.popDouble();
        var res = v1 * v2;
        stack.pushDouble(res);
    }
}
