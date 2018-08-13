package instructions.stores.fstore;

import instructions.base.inst.Index8Instruction;
import instructions.stores.StoresUtils;
import rtda._Frame;

public class FSTORE extends Index8Instruction {
    @Override
    public void execute(_Frame frame) {
        StoresUtils._fstore(frame, super.index);
    }
}
