package instructions.base;

import rtda._Frame;

public interface Instruction {

    void fetchOperands(BytecodeReader reader);

    void execute(_Frame frame);

}
