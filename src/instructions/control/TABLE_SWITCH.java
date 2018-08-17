package instructions.control;

import instructions.base.BranchUtils;
import instructions.base.BytecodeReader;
import instructions.base.Instruction;
import rtda._Frame;

public class TABLE_SWITCH implements Instruction {

    private int defaultOffset;
    private int low;
    private int hight;
    private int[] jumpOffsets;

    @Override
    public void fetchOperands(BytecodeReader reader) {
        reader.skipPadding();
        this.defaultOffset = reader.readInt32();
        this.low = reader.readInt32();
        this.hight = reader.readInt32();
        var jumpOffsetsCount = hight - low + 1;
        this.jumpOffsets = reader.readInt32s(jumpOffsetsCount);
    }

    @Override
    public void execute(_Frame frame) {
        var index = frame.operandStack().popInt();

        int offset;
        if (index > low && index < hight) {
            offset = jumpOffsets[index - low];
        } else {
            offset = defaultOffset;
        }

        BranchUtils.branch(frame, offset);
    }
}
