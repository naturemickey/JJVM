package instructions.constants;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class NOP extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        // nothing to do
    }
}
