package instructions.stores.dstore;

import instructions.base.inst.Index8Instruction;
import instructions.stores.StoresUtils;
import rtda._Frame;

public class DSTORE extends Index8Instruction {
    @Override
    public void execute(_Frame frame) {
        StoresUtils._dstore(frame, super.index);
    }
}
