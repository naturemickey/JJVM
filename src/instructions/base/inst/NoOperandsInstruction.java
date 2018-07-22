package instructions.base.inst;

import instructions.base.BytecodeReader;
import instructions.base.Instruction;
import rtda._Frame;

public abstract class NoOperandsInstruction implements Instruction {
    @Override
    public void fetchOperands(BytecodeReader reader) {
        // nothing to do
    }
}
