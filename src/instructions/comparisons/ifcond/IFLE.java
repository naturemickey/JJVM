package instructions.comparisons.ifcond;

import instructions.base.inst.BranchInstruction;
import rtda._Frame;
import static instructions.base.BranchUtils.*;

public class IFLE extends BranchInstruction {
    @Override
    public void execute(_Frame frame) {
        var i = frame.operandStack().popInt();
        if (i <= 0) {
            branch(frame, super.offset);
        }
    }
}
