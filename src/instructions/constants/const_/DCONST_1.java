package instructions.constants.const_;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class DCONST_1 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        frame.operandStack().pushDouble(1D);
    }
}
