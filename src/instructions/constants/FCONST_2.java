package instructions.constants;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class FCONST_2 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        frame.operandStack().pushFloat(2f);
    }
}
