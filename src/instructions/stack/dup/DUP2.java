package instructions.stack.dup;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class DUP2 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var slot1 = stack.popSlot();
        var slot2 = stack.popSlot();
        stack.pushSlot(slot2);
        stack.pushSlot(slot1);
    }
}
