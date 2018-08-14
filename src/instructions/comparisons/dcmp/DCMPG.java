package instructions.comparisons.dcmp;

import instructions.base.inst.NoOperandsInstruction;
import rtda._Frame;

public class DCMPG extends NoOperandsInstruction {

    protected boolean gFlag = true;

    @Override
    public void execute(_Frame frame) {
        var stack = frame.operandStack();
        var v2 = stack.popDouble();
        var v1 = stack.popDouble();

        if (v1 > v2) {
            stack.pushInt(1);
        } else if (v1 == v2) {
            stack.pushInt(0);
        } else if (v1 < v2) {
            stack.pushInt(-1);
        } else {
            stack.pushInt(gFlag ? 1 : -1);
        }
    }
}
