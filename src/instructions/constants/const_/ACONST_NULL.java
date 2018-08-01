package instructions.constants.const_;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class ACONST_NULL extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        frame.operandStack().pushRef(null);
    }
}
