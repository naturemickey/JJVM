package instructions.conversions.d2x;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class D2I extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var d = stack.popDouble();
        var i = (int) d;
        stack.pushInt(i);
    }
}
