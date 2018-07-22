package instructions.constants;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class DCONST_0 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        frame.operandStack().pushDouble(0D);
    }
}
