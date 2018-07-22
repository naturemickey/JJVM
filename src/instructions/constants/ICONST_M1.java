package instructions.constants;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class ICONST_M1 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        frame.operandStack().pushInt(-1);
    }
}
