package instructions.stores.istore;

import instructions.base.inst.Index8Instruction;
import instructions.stores.StoresUtils;
import rtda._Frame;

public class ISTORE extends Index8Instruction {
    @Override
    public void execute(_Frame frame) {
        StoresUtils._istore(frame, super.index);
    }
}
