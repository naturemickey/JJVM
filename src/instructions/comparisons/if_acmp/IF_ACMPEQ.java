package instructions.comparisons.if_acmp;

import instructions.base.inst.BranchInstruction;
import rtda._Frame;

public class IF_ACMPEQ extends BranchInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v2 = stack.popRef();
        var v1 = stack.popRef();

        if (v1 == v2) {
            branch(frame, super.offset);
        }
    }
}
