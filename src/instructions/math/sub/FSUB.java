package instructions.math.sub;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class FSUB extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v2 = stack.popFloat();
        var v1 = stack.popFloat();
        var res = v1 - v2;
        stack.pushFloat(res);
    }
}
