package instructions.loads.iload;

import instructions.base.inst.NoOperandsInstruction;
import instructions.loads.LoadsUtils;
import rtda._Frame;

public class ILOAD_2 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        LoadsUtils._iload(frame, 2);
    }
}
