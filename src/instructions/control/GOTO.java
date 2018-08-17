package instructions.control;

import instructions.base.inst.BranchInstruction;
import rtda._Frame;
import static instructions.base.BranchUtils.*;

public class GOTO extends BranchInstruction {
    @Override
    public void execute(_Frame frame) {
        branch(frame, super.offset);
    }
}
