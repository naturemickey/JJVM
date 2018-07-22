package instructions.base.inst;

import instructions.base.BytecodeReader;
import instructions.base.Instruction;

public class BranchInstruction implements Instruction {

    private int offset;

    @Override
    public void fetchOperands(BytecodeReader reader) {
        this.offset = reader.readInt16();
    }
}
