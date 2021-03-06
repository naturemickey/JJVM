package instructions.math.sub;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class LSUB extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v2 = stack.popLong();
        var v1 = stack.popLong();
        var res = v1 - v2;
        stack.pushLong(res);
    }
}
