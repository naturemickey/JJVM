package instructions.math.iinc;

import instructions.base.BytecodeReader;
import instructions.base.Instruction;
import rtda._Frame;

public class IINC implements Instruction {
    private int index;
    private int const_;

    @Override
    public void fetchOperands(BytecodeReader reader) {
        this.index = reader.readUint8();
        this.const_ = reader.readInt8();
    }

    @Override
    public void execute(_Frame frame) {
        var localVars = frame.localVars();
        var val = localVars.getInt(this.index);
        val += this.const_;
        localVars.setLong(this.index, val);
    }
}
