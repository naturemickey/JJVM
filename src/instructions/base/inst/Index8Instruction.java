package instructions.base.inst;

import instructions.base.BytecodeReader;
import instructions.base.Instruction;

public abstract class Index8Instruction implements Instruction {

    protected int index;
    @Override
    public void fetchOperands(BytecodeReader reader) {
        index = ((int)reader.readUint8()) & 0xff;
    }
}
