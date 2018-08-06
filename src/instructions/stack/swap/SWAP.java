package instructions.stack.swap;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class SWAP extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var s = frame.operandStack();
        var slot1 = s.popSlot();
        var slot2 = s.popSlot();
        s.pushSlot(slot1);
        s.pushSlot(slot2);
    }
}
