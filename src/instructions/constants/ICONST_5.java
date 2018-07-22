package instructions.constants;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class ICONST_5 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        frame.operandStack().pushInt(5);
    }
}
