package instructions.constants.const_;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class ICONST_3 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        frame.operandStack().pushInt(3);
    }
}
