package instructions.base.inst;

import instructions.base.BytecodeReader;
import instructions.base.Instruction;
import rtda._Frame;

public class NoOperandsInstruction implements Instruction {
    @Override
    public void fetchOperands(BytecodeReader reader) {

    }

    @Override
    public void execute(_Frame frame) {

    }
}
