package instructions.loads.iload;

import instructions.base.inst.Index8Instruction;
import instructions.loads.LoadsUtils;
import rtda._Frame;

public class ILOAD extends Index8Instruction {
    @Override
    public void execute(_Frame frame) {
        LoadsUtils._iload(frame, super.index);
    }
}
