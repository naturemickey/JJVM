package instructions.comparisons.ifcond;

import instructions.base.inst.BranchInstruction;
import rtda._Frame;

public class IFGT extends BranchInstruction {
    @Override
    public void execute(_Frame frame) {
        var i = frame.operandStack().popInt();
        if (i > 0) {
            branch(frame, super.offset);
        }
    }
}
