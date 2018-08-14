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

    public static void branch(_Frame frame, int offset) {
        var pc = frame.thread().pc();
        var nextPC = pc + offset;
        frame.setNextPC(nextPC);
    }
}
