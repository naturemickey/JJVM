package instructions.comparisons.if_icmp;

import instructions.base.inst.BranchInstruction;
import rtda._Frame;

public class IF_ICMPNE extends BranchInstruction {
    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v2 = stack.popInt();
        var v1 = stack.popInt();

        if (v1 != v2) {
            branch(frame, super.offset);
        }
    }
}
