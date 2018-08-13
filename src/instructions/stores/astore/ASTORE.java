package instructions.stores.astore;

import instructions.base.inst.Index8Instruction;
import instructions.stores.StoresUtils;
import rtda._Frame;

public class ASTORE extends Index8Instruction {
    @Override
    public void execute(_Frame frame) {
        StoresUtils._astore(frame, super.index);
    }
}
