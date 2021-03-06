package instructions.math.rem;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class LREM extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v2 = stack.popLong();
        var v1 = stack.popLong();
        var result = v1 % v2;
        stack.pushLong(result);
    }
}
