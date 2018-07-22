package instructions.base.inst;

import instructions.base.BytecodeReader;
import instructions.base.Instruction;

public class Index8Instruction implements Instruction {

    private int index;
    @Override
    public void fetchOperands(BytecodeReader reader) {
        index = ((int)reader.readUint8()) & 0xff;
    }
}
