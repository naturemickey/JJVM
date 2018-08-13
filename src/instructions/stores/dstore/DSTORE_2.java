package instructions.stores.dstore;

import instructions.base.inst.NoOperandsInstruction;
import instructions.stores.StoresUtils;
import rtda._Frame;

public class DSTORE_2 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        StoresUtils._dstore(frame, 2);
    }
}
