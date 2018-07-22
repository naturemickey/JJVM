package instructions.constants;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class LCONST_0 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        frame.operandStack().pushLong(0);
    }
}
