package instructions.math.sh;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class LSHR extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v2 = stack.popInt();
        var v1 = stack.popLong();
        var s = v2 & 0x3f;
        var result = v1 >> s;
        stack.pushLong(result);
    }
}
