package instructions.base.inst;

import instructions.base.BytecodeReader;
import instructions.base.Instruction;

public abstract class Index16Instruction implements Instruction {

    private int index;

    @Override
    public void fetchOperands(BytecodeReader reader) {
        this.index = ((int) reader.readUint16()) & 0xffff;
    }
}
