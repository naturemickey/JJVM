package instructions.conversions.i2x;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class I2L extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var i = stack.popInt();
        var l = (long) i;
        stack.pushLong(l);
    }
}
