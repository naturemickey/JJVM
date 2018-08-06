package instructions.math.sh;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class ISHR extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v2 = stack.popInt();
        var v1 = stack.popInt();
        var s = v1 & 0x1f;
        var result = v2 >> s;
        stack.pushInt(result);
    }
}
