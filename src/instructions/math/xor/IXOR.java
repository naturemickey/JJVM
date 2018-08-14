package instructions.math.xor;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class IXOR extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v2 = stack.popInt();
        var v1 = stack.popInt();
        var res = v1 ^ v2;
        stack.pushInt(res);
    }
}
