package instructions.stack.dup;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class DUP extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var slot = stack.popSlot();
        stack.pushSlot(slot);
        stack.pushSlot(slot);
    }
}
