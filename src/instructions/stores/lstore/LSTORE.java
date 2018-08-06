package instructions.stores.lstore;

import instructions.base.inst.Index8Instruction;
import instructions.stores.StoresUtils;
import rtda._Frame;

public class LSTORE extends Index8Instruction {
    @Override
    public void execute(_Frame frame) {
        StoresUtils._lstore(frame, super.index);
    }
}
