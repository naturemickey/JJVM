package instructions.stack.pop;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class POP2 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        var os = frame.operandStack();
        os.popSlot();
        os.popSlot();
    }
}
