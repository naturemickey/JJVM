package instructions.constants;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class FCONST_1 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        frame.operandStack().pushFloat(1f);
    }
}
