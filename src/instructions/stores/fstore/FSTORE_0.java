package instructions.stores.fstore;

import instructions.base.inst.NoOperandsInstruction;
import instructions.stores.StoresUtils;
import rtda._Frame;

public class FSTORE_0 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        StoresUtils._fstore(frame, 0);
    }
}
