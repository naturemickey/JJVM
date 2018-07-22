package instructions.base;

import rtda._Frame;

public interface Instruction {

    void fetchOperands(BytecodeReader reader);

    default void execute(_Frame frame) {
    }

}
