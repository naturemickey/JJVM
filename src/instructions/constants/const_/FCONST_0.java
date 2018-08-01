package instructions.constants.const_;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class FCONST_0 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        frame.operandStack().pushFloat(0f);
    }
}
