package instructions.constants.ipush;

import instructions.base.BytecodeReader;
import instructions.base.Instruction;
import rtda._Frame;

public class SIPUSH implements Instruction {

    private char val;
    @Override
    public void fetchOperands(BytecodeReader reader) {
        this.val = reader.readInt16();
    }

    @Override
    public void execute(_Frame frame) {
        int i = val;
        frame.operandStack().pushInt(i);
    }
}
