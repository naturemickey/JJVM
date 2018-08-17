package instructions.base.inst;

import instructions.base.BytecodeReader;
import instructions.base.Instruction;
import rtda._Frame;

public abstract class BranchInstruction implements Instruction {

    protected int offset;

    @Override
    public void fetchOperands(BytecodeReader reader) {
        this.offset = reader.readInt16();
    }

}
