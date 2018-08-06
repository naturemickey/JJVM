package instructions.stack.pop;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class POP extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        frame.operandStack().popSlot();
    }
}
